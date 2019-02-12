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
		<div class="product">
			<a href="caas">
			<img alt="" src="img/armor-icon.png"></a>
		</div>
		<div class="product">
		    <a href="allProducts">
			<img alt="" src="img/armor-icon.png"> </a>
		</div>
		<div class="product last">
			<a href="#"><img alt="" src="img/armor-icon.png"> </a>
		</div>
		<div class="clear"></div>
		<div class="product">
			<a href="#"><img alt="" src="img/armor-icon.png"> </a>
		</div>
		<div class="product">
			<a href="#"><img alt="" src="img/armor-icon.png"> </a>
		</div>
		<div class="product last">
			<a href="#"><img alt="" src="img/armor-icon.png"> </a>
							<c:forEach items="${products}" var="product">
    <p>${product}</p><br>
     </c:forEach>

		</div>
	</div>
	</div>

</div>
</body>
</html>