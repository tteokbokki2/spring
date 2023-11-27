<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tiles</title>
<tiles:insertAttribute name="asset" />
<style>

</style>
</head>
<body>
	<!-- member > info.jsp -->
	<tiles:insertAttribute name="main_menu" />

	<tiles:insertAttribute name="admin_menu" />

	<tiles:insertAttribute name="content" />

	<script>
		
	</script>

</body>
</html>