<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>메인페이지</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$('#nav_menu .over_1').hide();
		
		$('.nav_menu>li').mouseover(function() {
			$(this).children('.over_1').stop().slideDown();
		});
		
		$('.nav_menu>li').mouseleave(function() {
			$(this).children('.over_1').stop().slideUp();
		});
	});
</script>
<style>
	nav {
		width: 100%;
		height: 3000px;
	}
	
	nav ul li {
		width: 210px;
		display: inline-block;
		list-style: none;
		color: white;
		background-color: #2d2d2d;
		float: left;
		line-heigth: 30px;
		vertical-align: middle;
		text-align: center;
	}
	
	nav ul li a {
		text-decoration: none;
		color: white;
		display: block;
		width: 150px;
		font-size: 12px;
		font-weight: bold;
	}
</style>
</head>
<body>
<nav>
	<a href="main">메인페이지</a>
	<div>
		<ul class="nav_menu">
			<li>
				<h5><a href="diet">식단</a></h5>
			</li>
			<li>
				<h5><a href="today">오늘의 요리</a></h5>
			</li>
			<li>
				<h5 class="menu_1"><a href="exercise">운동</a></h5>
				<ul class="over_1">
					<li><h5><a href="HandExercise">맨몸 운동</a></h5></li>
					<li><h5><a href="MachineExercise">기구 운동</a></h5></li>
				</ul>
			</li>
			<li>
				<h5><a href="myPage">마이 페이지</a></h5>
			</li>
		</ul>
	</div>
</nav>
</body>
</html>
