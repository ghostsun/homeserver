<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding
    ="UTF-8"%>
<%@ page import="cn.javahot.homeserver.core.utils.CommandUtil" %>
<%@ page import="java.util.Date" %>
<%@ page import="cn.javahot.homeserver.core.service.DataParse" %>
<%@ page import="cn.javahot.homeserver.core.service.impl.DateParsePMS5003" %>
<%@ page import="cn.javahot.homeserver.core.model.PMSData" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>WOL</title>
	</head>
	<body>
<%
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
		PMS5003 Data, at <%= df.format(new Date()) %><br/>
 <%
 	DataParse parse = new DateParsePMS5003();
 	PMSData data = parse.parse(CommandUtil.exeCmd("/opt/getPMS5003Data"));
 	//out.println(CommandUtil.exeCmd("/opt/getPMS5003Data"));
	//out.println("\n");
	//out.println(new Date());
%>
		<table border="1" cellpadding="10">
			<tr>
				<th align="left">指标</th>
				<th align="right">数值</th>
			</tr>
			<tr>
				<td align="left">PM1.0浓度（CF=1，标准颗粒物)，单位μg/m³</td>
				<td align="right"><%= data.getPm1CF1() %></td>
			</tr>
			<tr>
				<td align="left">PM2.5浓度（CF=1，标准颗粒物)，单位μg/m³</td>
				<td align="right"><%= data.getPm25CF1() %></td>
			</tr>
			<tr>
				<td align="left">PM10浓度（CF=1，标准颗粒物)，单位μg/m³</td>
				<td align="right"><%= data.getPm10CF1() %></td>
			</tr>
			<tr>
				<td align="left">PM1.0浓度（大气环境下)，单位μg/m³</td>
				<td align="right"><%= data.getPm1() %></td>
			</tr>
			<tr>
				<td align="left">PM2.5浓度（大气环境下)，单位μg/m³</td>
				<td align="right"><%= data.getPm25() %></td>
			</tr>
			<tr>
				<td align="left">PM10浓度（大气环境下)，单位μg/m³</td>
				<td align="right"><%= data.getPm10() %></td>
			</tr>
			<tr>
				<td align="left">0.1升空气中直径在0.3um以上颗粒物个数</td>
				<td align="right"><%= data.getNumOf03umAt01() %></td>
			</tr>
			<tr>
				<td align="left">0.1升空气中直径在0.5um以上颗粒物个数</td>
				<td align="right"><%= data.getNumOf05umAt01() %></td>
			</tr>
			<tr>
				<td align="left">0.1升空气中直径在1.0um以上颗粒物个数</td>
				<td align="right"><%= data.getNumOf1umAt01() %></td>
			</tr>
			<tr>
				<td align="left">0.1升空气中直径在2.5um以上颗粒物个数</td>
				<td align="right"><%= data.getNumOf2umAt01() %></td>
			</tr>
			<tr>
				<td align="left">0.1升空气中直径在5.0um以上颗粒物个数</td>
				<td align="right"><%= data.getNumOf5umAt01() %></td>
			</tr>
			<tr>
				<td align="left">0.1升空气中直径在10um以上颗粒物个数</td>
				<td align="right"><%= data.getNumOf10umAt01() %></td>
			</tr>
		</table>
	</body>
</html>