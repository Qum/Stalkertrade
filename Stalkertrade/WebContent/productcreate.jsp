<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" type="text/css" rel="stylesheet">
<style>
#createForm {
	text-align: center;
}
</style>
<title>Create Product</title>
</head>
<body>
	<%
	    Object mess = request.getAttribute("mess");
	%>
	<div id="wrapper">
		<%@ include file="navi.jsp"%>
		<div id="content">
			<div id="createForm">
				<form action="addproduct.make" method="post">
					<input type="text" name="newname"> <input type="text" name="newcost">
					<input type="text" name="newdesc"> <input type="text" name="newcount">
					<input type="text" name="newtype"> <input type="submit" value="Add Product">
				</form>
			</div>
		</div>
	</div>
</body>
</html>