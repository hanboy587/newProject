<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="/resources/image/icon.png"/>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>

<script type="text/javascript">
	$(function(){
		$("#insertBtn").click(function(){
			$.ajax({
				async: false,
				url: "/memberInsertPro",
				dataType: "json",
				data: $("#insertForm").serialize(),
				type: "POST",
				success:function(data){
					console.log(data)
					if(data.resultStr == "fail"){
						alert("회원가입 실패");
						return false;
					}else{
						if(confirm("회원가입 진짜 할거임?")==true){
							alert("가입 ㅊㅋㅊㅋ");
							return location.href="/testList"
						}else{
							return false;
						}
					}
				}
			})
		})
	})
</script>
</head>
<body>
<div style="text-align:'center'; width:60%;">
	<form id="testForm">
		<table>
			<h1>회원가입</h1>
				<tbody>
					<tr>
						<td>이름 :</td>
						<td><input type="text" name="member_name"/></td>
					</tr>
					<tr>
						<td>아이디 :</td>
						<td><input type="text" name="member_id"/></td>
					</tr>
					<tr>
						<td>비밀번호 :</td>
						<td><input type="text" name="member_passwd"/></td>
					</tr>
					<tr>
						<td>생년월일 :</td>
						<td><input type="date" name="member_birthday"/></td>
					</tr>
					<tr>
						<td>휴대폰 :</td>
						<td><input type="text" name="member_phone"/></td>
					</tr>
				</tbody>
			</table>
			<div>
				<input type="button" id="insertBtn" value="완료">
				<input type="button" value="다시쓰기" onclick="reset()">
				<input type="button" value="취소" onclick="location.href='/'">
			</div>
	</form>
</div>	
</body>
</html>