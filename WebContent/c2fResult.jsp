<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C2F Results</title>
</head>
<body>
<h1>${equiv.getDegC()} degrees Celcius = ${equiv.getDegF()} degrees Fahrenheit.<br />
</h1>
<a href="c2f.jsp">Convert another Celcius to Fahrenheit</a><br />
<a href="index.jsp">Convert Fahrenheit to Celcius</a>
</body>
</html>