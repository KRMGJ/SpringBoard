<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>유저 수정</title>
</head>
<body>
	<div class="container mt-5">
		<form action="/user/update" method="post">
			<input type="hidden" name="id" value="${user.id}">
			<div class="mb-3">
				<label for="userId" class="form-label">아이디</label> <input
					type="text" class="form-control" id="userId" name="userId"
					value="${user.userId}" readonly>
			</div>
			<div class="mb-3">
				<label for="nickName" class="form-label">닉네임</label> <input
					type="text" class="form-control" id="nickName" name="nickName"
					value="${user.nickName}" required>
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">이메일</label> <input
					type="email" class="form-control" id="email" name="email"
					value="${user.email}" required>
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">비밀번호</label> <input
					type="password" class="form-control" id="password" name="password"
					required>
			</div>
			<button type="submit" class="btn btn-primary">수정하기</button>
		</form>
	</div>
</body>
</html>