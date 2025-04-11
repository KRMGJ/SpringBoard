<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<title>유저 목록</title>
</head>
<body>
	<div class="container mt-5">
		<h2>유저 목록</h2>
		<table class="table table-bordered table-hover">
			<thead class="table-light">
				<tr>
					<th>아이디</th>
					<th>이름</th>
					<th>이메일</th>
					<th>가입일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${userList}">
					<tr>
						<td>${user.userId}</td>
						<td>${user.nickName}</td>
						<td>${user.email}</td>
						<td>${user.createDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="text-end">
			<a href="/user/signUp" class="btn btn-primary">유저 추가</a>
		</div>
	</div>
</body>
</html>