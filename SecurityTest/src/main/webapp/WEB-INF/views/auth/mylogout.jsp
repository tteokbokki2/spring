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
	<!-- mylogout.jsp -->
	<%@ include file="/WEB-INF/views/inc/header.jsp" %>
	
	<h2>Logout Page</h2>
	
	<!--
		*** 주의
		1. method="POST"
		2. action="/컨텍스트명/로그아웃 페이지 주소"
	-->
	
	<form method="POST" action="/spring/auth/mylogout.do">
		<div>
			<button name="${_csrf.parameterName}" value="${_csrf.token}">로그아웃</button>
		</div>
	</form>

	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
		
	</script>

</body>
</html>