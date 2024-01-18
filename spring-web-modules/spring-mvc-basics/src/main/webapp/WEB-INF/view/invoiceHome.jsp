<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar factura</title>
</head>
<body>
	<h3>Bienvenido, introduzca los datos de la factura.</h3>

	<form:form method="POST" action="/spring-mvc-basics/addInvoice" modelAttribute="invoice">
		<table>
			<tr>
				<td><form:label path="concepto">Concepto</form:label></td>
				<td><form:input path="concepto" /></td>
			</tr>
			<tr>
				<td><form:label path="cantidad">Cantidad</form:label></td>
				<td><form:input path="cantidad" /></td>
			</tr>
			<tr>
				<td><form:label path="retencion">Porcentaje retenci&oacute;n</form:label></td>
				<td><form:input path="retencion" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enviar" /></td>
			</tr>
		</table>
	</form:form>

</body>

</html>