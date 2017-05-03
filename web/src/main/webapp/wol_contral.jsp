<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding
    ="UTF-8"%>
<%@ page import="cn.javahot.homeserver.core.model.WolData" %>
<%@ page import="cn.javahot.homeserver.core.service.WolService" %>
<%@ page import="cn.javahot.homeserver.core.service.impl.WolServiceImpl" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>WOL</title>
	</head>
	<body>
<%
	WolService wolService = new  WolServiceImpl();
	WolData data = new WolData();
	
	data.setIp(request.getAttribute("ip"));
	data.setMac(request.getAttribute("mac"));
	data.setPort(request.getAttribute("port"));
	
	String result = wolService.wol(data);
%>
		result: <%= result %><br/>

	</body>
</html>