<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <title>Vaccination Home Page</title>
    <link rel="stylesheet" href="styles.css" />
</head>
<body>
<h1 style="font-size:60px;">Get your Vaccine from nearest center</h1>
    <div id="advert">
        <div id="inner">
            Find your nearest Vaccination Centre ::-
        </div>
        <br>
        <a  class="link" href="/api/v1/all">View All</a>
        <br><br>
        <a class="link" href="/api/v1/dist">Search by District</a>
        <br><br>
        <a  class="link" href="/api/v1/pin">Search by Pincode</a>
    </div>
</body>
</html>