<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<h1>Fahrenheit to Celcius Temperature Converter</h1>
<form action="f2cServlet" method="post">
Enter the temperature in degrees fahrenheit to convert to Celcius:
<input type="text" name="degreesF" size="10">
<input type="submit" value="Get Degrees Celcius" />
</form>
<p><br />
<a href="c2f.jsp">Convert Celcius to Fahrenheit</a>
</p>
</body>
</html>