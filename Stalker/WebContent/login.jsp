<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/login.js" type="text/javascript"> </script>
<link href="css/style.css" type="text/css" rel="stylesheet">
<link href="css/reg.css" type="text/css" rel="stylesheet">
<title>Авторизация</title>
</head>
<body> 
	<div id="wrapper">
<%@ include file="navi.jsp"%>
		<div id="content">
			<div id="forma">
				 <h1 style="color:aqua;">Авторизация</h1>
				<form onsubmit="return loginDataCheck(logForma)" action="logincheck" method="post" name="logForma">
						<a>Введите ник</a>   <input type="text" name="uname">
						 <br>
						 <br>
						<a>Введите пароль</a>  <input type="text" name="upass">
						 <br>
						 <br>
						<input type="submit" value="login">
				</form> 
						<c:forEach items="${errors}" var="err">
          			    <p>${err}</p><br>
          			    </c:forEach>
			</div>
		</div>
	</div>
</body>
</html>