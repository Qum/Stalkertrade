<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" type="text/css" rel="stylesheet">
<style>
#forma {
	text-align: center;
	margin-top: 30px;
	color: aquamarine;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<%
	    Object mess = request.getAttribute("mess");
	%>
	<div id="wrapper">
<%@ include file="navi.jsp"%>
		<div id="content">
			<div id="forma">
				<c:forEach  items="${CartItems}" var="Product">
					<a>${Product.cost}</a>
					<br>
					<a>${Product.desc}</a>
					<br>
					<br>
				</c:forEach>
				<h1>${mess}</h1>
			</div>
		</div>
	</div>
</body>
</html>