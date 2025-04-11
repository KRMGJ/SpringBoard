<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<title>내 정보</title>
</head>
<body>
	<div class="container mt-5">
		<h2>내 정보</h2>
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
				<tr>
					<td>${user.userId}</td>
					<td>${user.nickName}</td>
					<td>${user.email}</td>
					<td>${user.createDate}</td>
				</tr>
			</tbody>
		</table>

		<div class="text-end">
			<a href="/user/update?userId=${user.userId}" class="btn btn-primary">정보 수정</a> <a
				href="/user/delete?userId=${user.userId}" class="btn btn-danger">회원 탈퇴</a> <a
				href="/user/list" class="btn btn-secondary">목록으로</a>
		</div>

	</div>
</body>
</html>