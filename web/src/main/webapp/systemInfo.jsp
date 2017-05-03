<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding
    ="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>testCommandLine</title>
	</head>
	<body>
<%
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
		Time : <%= df.format(new Date()) %><br/>
		<table border="1" cellpadding="10">
			<tr>
				<th align="left">系统项</th>
				<th align="right">系统值</th>
			</tr>
			<tr>
				<td align="left">sun.arch.data.model</td>
				<td align="right"><%= System.getProperty("sun.arch.data.model") %></td>
			</tr>
			<tr>
				<td align="left">os.arch</td>
				<td align="right"><%= System.getProperty("os.arch") %></td>
			</tr>
			<tr>
				<td align="left">os.name</td>
				<td align="right"><%= System.getProperty("os.name") %></td>
			</tr>
			
			
		</table>
	</body>
</html>