<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" 
    pageEncoding="UTF-8"%>
<%@ page import="com.cheng.domain.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
</head>
<body>
	
	<table border="0" >
		<tr>
			<td>ID</td>
			<td>用户名</td>
			<td>密码</td>
			<td>年龄</td>
		</tr>
	<c:forEach items="${users}" var="item">
		<tr>
			<td>${item.id }</td>
			<td>${item.userName }</td>
			<td>${item.password }</td>
			<td>${item.age }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>