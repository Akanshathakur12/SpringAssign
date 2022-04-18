<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Vaccination Ceters</title>
</head>
<body>
<header>All Vaccination Centers list</header>
	<table border="1" width="70%" cellpadding="9">
        <tr>
        	<th>Id</th>
            <th>Center Name</th>
            <th>Center Pincode</th>
            <th>Center District</th>
            <th>Available Vaccines</th>
        </tr>
        <c:forEach var="lst" items="${list}">
            <tr>
                <td>${lst.id}</td>
                <td>${lst.centerName}</td>
                <td>${lst.centerPincode}</td>
                <td>${lst.centerDistrict}</td>
                <td>${lst.getAvailableVaccines()}</td>
            </tr>
        </c:forEach>
    </table>
<br>
 		<a class="link" href="/api/v1/dist">Search by District</a>
        <br><br>
        <a  class="link" href="/api/v1/pin">Search by Pincode</a>
        <br><br>
        <a class="link" href="/">Home</a>
</body>
</html>