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
			<c:if test="${LoggetUser != null}" > 
				<div class="product">
					<img alt="" src="img/armor-icon.png"></a>
					<a href="poroductcategory?type=weapons">Вооружение</a>
				</div>
				</c:if>
				<div class="product">
					<img alt="" src="img/armor-icon.png"></a>
					<a href="/armor">Экипировка <c:out value="${LoggetUser.getName()}"/>	</a>
					<br>
									


				</div>
			</div>
		</div>
	</div>
</body>
</html>