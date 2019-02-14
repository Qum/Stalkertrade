<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="header">
	<ul>
			<c:choose>
			<c:when test="${LoggetUser != null}">
				<li><a href="/Stalkertrade">Главная</a></li>
				<li><a href="profile.do">Мой профиль</a></li>
				<li><a href="logout.do">Выход</a></li>
				<c:if test="${LoggetUser.getAcc_lvl() > 10}">
					<li><a href="manage.jsp">Admin</a></li>				
				</c:if>
			</c:when>
			 <c:otherwise>
				<li><a href="/Stalkertrade">Главная</a></li>
				<li><a href="register.jsp">Регистрация</a></li>
				<li><a href="login.jsp">Войти</a></li>
			 </c:otherwise>
			 </c:choose>
			<li><a href="mycart.jsp"> Корзина : (${cookie['productsncart']})</a></li>
	</ul>
</div>