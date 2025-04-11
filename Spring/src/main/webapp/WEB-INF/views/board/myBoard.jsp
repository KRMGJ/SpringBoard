<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>내 게시물</title>
</head>
<body>
	<div class="container mt-5">
		<h2>내 게시물</h2>
		<table class="table table-bordered table-hover">
			<thead class="table-light">
				<tr>
					<th>게시물 번호</th>
					<th>제목</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${myBoardList}">
					<tr>
						<td>${board.id}</td>
						<td><a href="/board/view?id=${board.id}">${board.title}</a></td>
						<td>${board.createDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="text-end">
			<a href="/board/write" class="btn btn-primary">글쓰기</a> <a
				href="/user/myPage" class="btn btn-secondary">내 정보</a> <a
				href="/user/logout" class="btn btn-danger">로그아웃</a>
		</div>
	</div>
</body>
</html>