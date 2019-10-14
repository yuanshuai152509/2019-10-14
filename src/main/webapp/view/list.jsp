<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/jquery-3.2.1.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resource/mystyles.css" type="text/css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>价格</td>
			<td>百分数</td>
		</tr>
		<c:forEach items="${list }" var="g">
			<tr>
				<td>${g.id }</td>
				<td>${g.name }</td>
				<td>${g.price }</td>
				<td>${g.baifen }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>