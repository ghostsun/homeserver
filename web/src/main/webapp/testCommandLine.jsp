<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="cn.javahot.homeserver.core.utils.CommandUtil,java.util.*, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>testCommandLine</title>
</head>
<body>
PMS5003 Data: <br/>
<%
out.println(CommandUtil.exeCmd("ping www.baidu.com -n 5"));
%>
</body>
</html>