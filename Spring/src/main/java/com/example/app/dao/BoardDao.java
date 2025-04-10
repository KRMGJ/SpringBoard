package com.example.app.dao;

import com.example.app.model.Board;

import java.util.List;

public interface BoardDao {
    void save(Board board);
    List<Board> findAll();
    List<Board> findByUser_id(int id);
    Board findById(int id);
    void update(Board board);
    void delete(int id);
}
