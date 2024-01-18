package com.baeldung.web.controller;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.math.RoundingMode;

import com.baeldung.model.Employee;
import com.baeldung.model.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InvoiceController {
    Map<Long, Invoice> invoiceMap = new HashMap<>();

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("invoiceHome", "invoice", new Invoice());
    }

    @RequestMapping(value = "/addInvoice", method = RequestMethod.POST)
    public String submit(@ModelAttribute("invoice") final Invoice invoice, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        BigDecimal totalRetencion = invoice.getCantidad().multiply(invoice.getRetencion()).divide(new BigDecimal("100"),RoundingMode.HALF_UP);
        BigDecimal total = invoice.getCantidad().subtract(totalRetencion);

        model.addAttribute("concepto", invoice.getConcepto());
        model.addAttribute("cantidad", invoice.getCantidad());
        model.addAttribute("retencion", invoice.getRetencion());
        model.addAttribute("total", total);

        Long id;

        if (invoiceMap.isEmpty()) {
            id = 1L;
        } else {
            id = Collections.max(invoiceMap.keySet());
        }

        model.addAttribute("id", id);

        invoiceMap.put(id, invoice);

        return "invoiceView";
    }
}
