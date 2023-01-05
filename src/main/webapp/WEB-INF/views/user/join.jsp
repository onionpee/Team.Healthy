<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
	이메일<input class="mail" name="userEmail">
	이름<input class="name" name="userName">
	<input type="button" class="join" value="확인">

</form>
<script>
$(document).ready(function() {
	$(".join").click(function(){
		$("#joinUp").attr("action", "join");
		$("#joinUp").submit();
	});
});
</script>
</body>
</html>