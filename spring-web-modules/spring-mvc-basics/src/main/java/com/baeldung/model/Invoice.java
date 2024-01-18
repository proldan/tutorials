package com.baeldung.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
public class Invoice {
    private Long id;
    private String concepto;
    private BigDecimal cantidad;
    private BigDecimal retencion;
    public Invoice() {
        super();
    }

    public Invoice(final String concepto, final BigDecimal cantidad, final BigDecimal retencion) {
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.retencion = retencion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getRetencion() {
        return retencion;
    }

    public void setRetencion(BigDecimal retencion) {
        this.retencion = retencion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
