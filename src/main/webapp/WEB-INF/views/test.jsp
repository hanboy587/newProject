<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="/resources/image/icon.png"/>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
	<h1>첫 테스트~~~</h1>
	<table border="1">
		<tbody>
			<c:forEach var="list" items="${map.list}">
				<tr>
					<td>${list.member_no }</td>
					<td>${list.member_name }</td>
					<td>${list.member_id }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/memberInsert">회원가입</a>
</body>
</html>