<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
<h1>${equiv.getDegF()} degrees Fahrenheit = ${equiv.getDegC()} degrees Celcius.<br />
</h1>
<a href="index.jsp">Convert another Fahrenheit to Celcius</a><br />
<a href="c2f.jsp">Convert Celcius to Fahrenheit</a>
</body>
</html>