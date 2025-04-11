<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판 보기</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="card">
            <div class="card-body">
                <p><strong>제목:</strong> ${board.title}</p>
                <p><strong>작성일:</strong> ${board.createDate}</p>
                <p><strong>내용:</strong></p>
                <p>${board.content}</p>
            </div>
            <div class="card-footer text-end">
                <a href="/board/list" class="btn btn-secondary">목록으로</a>
                <a href="/board/update?id=${board.id}" class="btn btn-warning">수정</a>
				<form action="/board/delete" method="post" style="display: inline;">
					<input type="hidden" name="id" value="${board.id}">
					<button type="submit" class="btn btn-danger">삭제</button>
				</form>
            </div>
        </div>
        <div class="mt-3">
            <div class="text-end">
                <a href="/board/write" class="btn btn-primary">글쓰기</a>
			</div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>