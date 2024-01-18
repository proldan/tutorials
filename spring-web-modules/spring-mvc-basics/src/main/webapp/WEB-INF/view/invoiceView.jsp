<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Facturas</title>
</head>
<body>

	<h2>Datos de la factura</h2>
	<table>
		<tr>
			<td>Id.:</td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>Concepto:</td>
			<td>${concepto}</td>
		</tr>
		<tr>
			<td>Cantidad:</td>
			<td>${cantidad}</td>
		</tr>
		<tr>
			<td>Retenci&oacute;n:</td>
			<td>${retencion}</td>
		</tr>
		<tr>
			<td>Total:</td>
			<td>${total}</td>
		</tr>
	</table>
</body>
</html>