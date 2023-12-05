<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!-- inc > header.jsp -->

<header>
	<h1>Spring Security</h1>
	
	<ul>
		<li><a href="/spring/index.do">Index</a></li>
		
		<sec:authorize access="hasRole('ROLE_MEMBER')">
		<li><a href="/spring/member/member.do">Member</a></li>
		</sec:authorize>
		
		<sec:authorize access="hasRole('ROLE_ADMIN')">
		<li><a href="/spring/admin/admin.do">Admin</a></li>
		</sec:authorize>
		
		<sec:authorize access="isAnonymous()"> <!-- 익명 사용자 -->
		<li><a href="/spring/auth/mylogin.do">Login</a></li>
		<li><a href="/spring/auth/register.do">Register</a></li>
		</sec:authorize>
		
		<sec:authorize access="isAuthenticated()"> <!-- 인증된 사용자 -->
		<li><a href="/spring/auth/mylogout.do">Logout</a></li>
		<li><a href="/spring/auth/myinfo.do">Info</a></li>
		</sec:authorize>
		
	</ul>
</header>
