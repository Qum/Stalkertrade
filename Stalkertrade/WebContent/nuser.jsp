<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" type="text/css" rel="stylesheet">
<style>
#forma {
	text-align: center;
	margin: 20px 0px;
}
</style>
<title>Create new User</title>
</head>
<body>
	<div id="wrapper">
<%@ include file="navi.jsp"%>
		<div id="content">
			<div id="forma">
				<form action="addingUser" method="post">
					<input type="text" name="uname"> <br> 
					<input type="text" name="uage"><br>
					<input type="submit" value="Create">
				</form>
			</div>
		</div>
	</div>
</body>
</html>