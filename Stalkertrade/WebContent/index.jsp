<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" type="text/css" rel="stylesheet">
<link href="css/index.css" type="text/css" rel="stylesheet">
<title>CRUD Bassic</title>
</head>
<body>
	<div id="wrapper">
		<%@ include file="navi.jsp"%>
		<div id="content">
			<div id="goods">
				<div class="product">
					<a href="poroductcategory?type=weapon"> <img alt="armor" src="img/armor-icon.png">
						Вооружение
					</a>
				</div>
				<div class="product">
					<a href="poroductcategory?type=armor"> <img alt="armor" src="img/armor-icon.png">
						Экипировка
					</a>
				</div>
				<div class="product">
					<a href="poroductcategory?type=other"> <img alt="armor" src="img/armor-icon.png">
						Полезные вещи
					</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>