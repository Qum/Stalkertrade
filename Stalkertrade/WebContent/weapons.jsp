<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<Table>
					<c:forEach items="${products}" var="pro">
						<tr>
							<td>
								<table class="descprod">
									<tr>
										<p>${pro.getProd_name()}</p>
									</tr>
									<tr>
										<p>${pro.getDesc()}</p>
									</tr>
									<tr>
										<p>Цкна : ${pro.getCost()}</p>
									</tr>
									<tr>
										<a class="order" href="addprodtocart?prodid=${pro.getId()}">Купить</a>
									</tr>
								</table>
							</td>
							<td><img alt="" src="img/armor-icon.png"></td>
						</tr>
						<tr>
						</tr>
					</c:forEach>
				</Table>
			</div>
		</div>
	</div>
</body>
</html>