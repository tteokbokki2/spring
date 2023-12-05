<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example</title>
<link rel="stylesheet" href="https://me2.do/5BvBFJ57">
<style>

</style>
</head>
<body>
	<!-- register.jsp -->
	
	<h2>Register Page <small>가입</small></h2>
	
	<form method="POST" action="/spring/auth/registerok.do">
	
		<table class="vertical">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="userid" required></td>
			</tr>
			<tr>
				<th>암호</th>
				<td><input type="text" name="userpw" required></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="username" required></td>
			</tr>
			<tr>
				<th>권한</th>
				<td>
					<select name="auth">
						<option value="1">회원</option>
						<option value="2">관리자</option>
					</select>
				</td>
			</tr>
		</table>
		<div>
			<input type="submit" value="가입하기">	
		</div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"> <!-- POST로 요청할 때 인증토큰을 넘기는 코드를 추가하자 -->
	</form>

	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
		
	</script>

</body>
</html>