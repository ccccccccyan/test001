<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<!-- ttb : 받을때, tts : 보낼 때, cur_nm : 국가/통화명 -->
		받을 때 / 보낼 때 / 국가,통화명 <br>
		<hr>
		
		<c:forEach var="vo" items="${list}">
			${vo.tts} / ${vo.ttb} / ${vo.cur_nm} / ${vo.cur_unit} / ${vo.rate_date}<br>
		</c:forEach>
	</body>
</html>