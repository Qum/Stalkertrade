<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="header">
	<ul>
		<c:choose>
			<c:when test="${LoggetUser != null}">
				<li><a href="/Stalkertradee">Главная</a></li>
				<li><a href="profile.do">Мой профиль</a></li>
				<li><a href="logout.do">Выход</a></li>
				<c:if test="${LoggetUser.getAcc_lvl() > 10}">
					<li><a href="manage.jsp">Admin</a></li>
				</c:if>
			</c:when>
			<c:otherwise>
				<li><a href="/Stalkertradee">Главная</a></li>
				<li><a href="register.jsp">Регистрация</a></li>
				<li><a href="login.jsp">Войти</a></li>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${cart != null}">
				<li><a href="mycart"> Корзина (${cart.size()})</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="mycart"> Корзина (0)</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
</div>