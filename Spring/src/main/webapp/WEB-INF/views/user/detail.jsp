<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>유저 상세정보</title>
</head>
<body>
	<div class="container mt-5">
		<h2>유저 상세정보</h2>
		<table class="table table-bordered table-hover">
			<tr>
				<th>아이디</th>
				<td>${user.userId}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${user.nickName}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${user.email}</td>
			</tr>
			<tr>
				<th>가입일</th>
				<td>${user.createDate}</td>
			</tr>

			<tr class="text-center">
				<td colspan="2">
					<a href="/user/update?userId=${user.userId}" class="btn btn-primary">수정하기</a>
					<a href="/user/delete?userId=${user.userId}" class="btn btn-danger">삭제하기</a>
					<a href="/user/list" class="btn btn-secondary">목록으로 돌아가기</a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>