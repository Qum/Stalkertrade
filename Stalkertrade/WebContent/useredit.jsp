<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" type="text/css" rel="stylesheet">
<title>Edit Users</title>
</head>
<body>
	<div id="wrapper">
<%@ include file="navi.jsp"%>
		<div id="content">
			<%
			    Object name1 = request.getAttribute("1");
			    Object name2 = request.getAttribute("2");
			%>

			<table border="1">
				<tr>
					<th><%=name1%></th>
					<th><form action="ueditor">
							<input type="hidden" name="edit" value="<%=name1%>">
							 <input type="submit" value="EDIT">
						</form></th>
					<th><form action="ueditor">
							<input type="hidden" name="delete" value="<%=name1%>"> 
							<input type="submit" value=DELETE>
						</form></th>
				</tr>
				
				<tr>
					<td><%=name2%></td>
					<td><form action="ueditor">
							<input type="hidden" name="edit" value="<%=name2%>">
							 <input type="submit" value="EDIT">
						</form></td>
					<td><form action="ueditor">
							<input type="hidden" name="delete" value="<%=name2%>"> 
							<input type="submit" value=DELETE>
						</form></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>