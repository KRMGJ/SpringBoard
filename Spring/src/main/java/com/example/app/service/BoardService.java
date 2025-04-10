package com.example.app.service;

import com.example.app.model.Board;

import java.util.List;

public interface BoardService {
    void createBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(int id);
    Board getBoard(int id);
    List<Board> getAllBoards();
}
