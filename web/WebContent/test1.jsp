<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>転送先</title>
</head>
<body>
<h1>ごちそうさまです。</h1>
session name = <%= session.getAttribute("name") %><br>
request age  = <%= request.getAttribute("age") %>
</body>
</html>