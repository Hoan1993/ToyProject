<%-- 기사 본문이 출력되는 페이지 --%>
<%-- 페이지가 아예 이렇게 넘어오는 게 아니고 메인 리스트에서 가운데만 이걸로 전환되게끔 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="css/bootstrap-3.4.1.css">
<style type="text/css">
.blog-post {
  margin-bottom: 60px;
}
.blog-post-title {
  margin-bottom: 5px;
  font-size: 40px;
}
.blog-post-meta {
  margin-bottom: 20px;
  color: #999;
}

</style>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	
	<div class="row">
		<c:set var="article" value="${Cont }" />
		<div class="col-sm-8 blog-main">
			<div class="blog-post">
				<h2 class="blog-post-title">${article.getArticle_title() }</h2>
				<p class="blog-post-meta">${article.getArticle_date() }
				<a href="#">${article.getArticle_name() }</a>
				</p>
				<hr>
				<p>
				<font style="vertical-align: inherit;">${article.getArticle_cont() }</font>
				</p>
			</div>
			<!-- /.blog-post -->

			<nav>
				<ul class="pager">
					<li><a href="#">Previous</a></li>
					<li><a href="#">Next</a></li>
				</ul>
			</nav>

		</div>
		<!-- /.blog-main -->

	</div>


</body>
</html>