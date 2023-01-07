<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>
<form id="joinUp" method="post">
	아이디<input class="id" name="userId">
	비밀번호<input class="pw" name="userPW">
	<input type="button" class="join" value="확인">
	<c:if test="${result == 0}">
		<h5>아이디 비밀번호 확인</h5>
	</c:if>
</form>
<script>
$(document).ready(function() {
	$(".join").click(function(){
		$("#joinUp").attr("action", "login");
		$("#joinUp").submit();
	});
});
</script>
</body>
</html>