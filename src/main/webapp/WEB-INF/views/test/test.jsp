<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="/resources/image/icon.png"/>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/resources/image/icon.png" />
<link rel="stylesheet"
	href="/resources/include/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/resources/include/dist/css/bootstrap-theme.min.css">
<script src="/resources/include/dist/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Gugi&display=swap"
	rel="stylesheet">
<script type="text/javascript"
	src="/resources/include/js/jquery-1.12.4.min.js"></script>
<script
	src="/resources/include/dist/assets/js/ie-emulation-modes-warning.js"></script>
<script
   src="/resources/include/dist/assets/js/ie10-viewport-bug-workaround.js"></script>
<script type="text/javascript" src="/resources/include/js/common.js"></script>
</head>
<body>
	<h1>첫 테스트~~~</h1>
	<c:forEach var="list" items="${map.list}">
		<p>${map.list }</p>
	</c:forEach>
</body>
</html>