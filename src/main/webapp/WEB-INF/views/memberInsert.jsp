<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<div>
		<h1>회원가입</h1>
	</div>
	<div style="width:650px;" align="right">
		<a href="*">리스트로</a>
	</div>
	<hr style="width: 600px">
	<form  id="testForm" >
		<table border="1">
			<tbody>
				<tr>
					<td style="width: 150px;"align="center">이름 :</td>
					<td style="width: 400px;"><input type="text" name="member_name"/></td>
				</tr>
				<tr>
					<td style="width: 150px;"align="center">아이디 :</td>
					<td style="width: 400px;"><input type="text" name="member_id"/></td>
				</tr>
				<tr>
					<td style="width: 150px;"align="center">비밀번호 :</td>
					<td style="width: 400px;"><input type="text" name="member_passwd"/></td>
				</tr>
				<tr>
					<td style="width: 150px;"align="center">생년월일 :</td>
					<td style="width: 400px;"><input type="date" name="member_birthday"/></td>
				</tr>
				<tr>
					<td style="width: 150px;"align="center">휴대폰 :</td>
					<td style="width: 400px;"><input type="text" name="member_phone"/></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td>
					<td align="right">
					<input type="button" id="writeBtn" value="글쓰기">
					<input type="button" value="다시쓰기" onclick="reset()">
					<input type="button" value="취소" onclick="history.go(-1)">
					&nbsp;&nbsp;&nbsp;
					</td>
				</tr>
			</tfoot>
		</table>

	</form>
</body>
</html>