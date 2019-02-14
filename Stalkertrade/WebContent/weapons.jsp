<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" type="text/css" rel="stylesheet">
<link href="css/index.css" type="text/css" rel="stylesheet">
<title>CRUD Basic</title>
</head>
<body>
	<div id="wrapper">
		<%@ include file="navi.jsp"%>
		<div id="content">
			<div id="goods">
			<p>asdasd</p>
				<c:forEach items="${products}" var="pro">
   					<p>Продукт: ${pro.getProd_name()}</p>
				</c:forEach>

			</div>
		</div>
	</div>
</body>
</html>