<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<h1>Celcius to Fahrenheit Temperature Converter</h1>
<form action="c2fServlet" method="post">
Enter the temperature in degrees celcius to convert to fahrenheit:
<input type="text" name="degreesC" size="10">
<input type="submit" value="Get Degrees Fahrenheit" />
</form>
<p><br />
<a href="index.jsp">Convert Fahrenheit to Celcius</a>
</p>
</body>
</html>