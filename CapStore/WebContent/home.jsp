<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
<h1> Dispatch Report</h1>
<form action="display" method="get">
<table>
<tr>
	<td>
		<select id="product_name" name="product_name" >
			<option value="">Please Select product</option>
			<option value="Prod06">One Plus 6T</option>
			<option value="Prod01">Nokia 6.1 Plus</option>							
		</select>
	</td>
	<td><input type="submit" value="View"/> </td>
</tr>
</table>
</form>			