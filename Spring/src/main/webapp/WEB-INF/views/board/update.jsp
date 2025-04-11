<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 수정</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<form action="/board/update" method="post">
			<input type="hidden" name="id" value="${board.id}">
			<div class="mb-3">
				<label for="title" class="form-label">제목</label> <input type="text"
					id="title" name="title" class="form-control" value="${board.title}"
					required>
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">내용</label>
				<textarea id="content" name="content" class="form-control" rows="5"
					required>${board.content}</textarea>
			</div>
			<div class="text-end">
				<button type="submit" class="btn btn-primary">수정</button>
				<a href="/board/view?id=${board.id}" class="btn btn-secondary">취소</a>
			</div>
		</form>
	</div>
</body>
<!-- Bootstrap JS (Optional) -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>