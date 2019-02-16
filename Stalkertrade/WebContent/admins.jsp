<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/manage.css" type="text/css" rel="stylesheet">
<link href="css/style.css" type="text/css" rel="stylesheet">
<style>
</style>
<title>Create new User</title>
</head>
<body>
	<div id="wrapper">
		<%@ include file="navi.jsp"%>
		<div id="content">
			<a href="productcreate.jsp">Добавление продуктов</a>
			<c:forEach items="${users}" var="user">
				<div>${user.getName()}</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>