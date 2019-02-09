<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" type="text/css" rel="stylesheet">
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

		</div>
		</div>
	</div>
</body>
</html>