<%@page import="com.sathya.servlet.ProductDao"% import="java.util.Base64"%>
<%@ page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<title>Product List</title>
<!-- BootStrap CDN link to get the support of BootStrap -->
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
<table class="table table-boarded table-striped">
<thead class="thead-dark">
<tr>

		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Cost</th>
		<th>Product Brand</th>
		<th>Made In</th>
		<th>Manufacture Date</th>
		<th>Expire Date</th>
		<th>Image</th>
		</tr>
</thead>
<tbody>
		<c:forEach var="product" items="<%= new ProductDao().findAll() %>">
		<tr>
		<td>${product.proId }</td>
		<td>${product.proName }</td>
		<td>${product.proPrice }</td>
		<td>${product.proBrand }</td>
		<td>${product.proMadeIn }</td>
		<td>${product.proMfgDate }</td>
		<td>${product.proExpireDate }</td>
		<td><img src="data:image/jpeg;Base64,${Base64.getEncoder().encoderToString(product.proImage)}" alt="productImage" style="max-width: 100px; max-height: 100px;">
		</td>
		
		</tr>
		
		</c:forEach>
</tbody>
</table>
</body>
</html>