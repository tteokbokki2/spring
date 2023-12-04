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
	<!-- mylogin.jsp -->
	<%@ include file="/WEB-INF/views/inc/header.jsp" %>
	
	<h2>Login Page</h2>
	
	<!--
		*** 주의
		1. method="POST"
		2. action="/컨텍스트명/login"
		3. 아이디: name="username" 고정!
		4. 암호: name="password"
	-->
	
	<form method="POST" action="/spring/login">
		<div>
			<input type="text" name="username" placeholder="ID" required>
		</div>
		<div>
			<input type="password" name="password" placeholder="Password" required>
		</div>
		<div>
			<button class="in">로그인</button>
		</div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"> <!-- POST로 요청할 때 인증토큰을 넘기는 코드를 추가하자 -->
	</form>

	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
		
	</script>

</body>
</html>