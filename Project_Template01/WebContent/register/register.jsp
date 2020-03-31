<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Creative Colorlib SignUp Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
<link rel="stylesheet" href="css/register.css">
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>회원가입폼</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
			
				<form action="board_joinOk.do" method="post">
					<input class="text" type="text" name="Username" placeholder="이름" required="">
					<input class="text email" type="email" name="email" placeholder="이메일" required="">
					<input class="text" type="password" name="password" placeholder="비밀번호" required="">
					<input class="text w3lpass" type="password" name="password" placeholder="비밀번호 확인" required="">
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox" required="">
							<span>열심히 참여해 주실거죠?</span>
						</label>
						<div class="clear"> </div>
					</div>
					<input type="submit" value="회원가입">
				</form>
				<p>계정이 이미 있나요?  &nbsp; &nbsp; <a href="board_loginForm.do"> 로그인하기</a></p>
			</div>
		</div>
		<!-- copyright -->
		<div class="colorlibcopy-agile">
			<p>© 2018 Colorlib Signup Form. All rights reserved | Design by <a href="#" target="_blank">Colorlib</a></p>
		</div>
		<!-- https://colorlib.com/ -->
		<!-- //copyright -->
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<!-- //main -->
</body>
</html>