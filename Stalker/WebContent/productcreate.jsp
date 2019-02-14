<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" type="text/css" rel="stylesheet">
<style >
    #createForm {
        text-align: center;
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
		<div id="createForm">
            <form action="productcreate.do" method="post" >
            <input type="text" name="pname">
            <input type="text" name="pcost">
            <input type="text" name="pdesc">
            <input type="submit" value="Add Product" >
            </form>
		</div>
		</div>
	</div>
</body>
</html>