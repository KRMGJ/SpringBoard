package com.example.app.service.serviceImpl;

import com.example.app.dao.BoardDao;
import com.example.app.model.Board;
import com.example.app.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardDao boardDao;

    @Override
    public void createBoard(Board board) {
        boardDao.save(board);
    }

    @Override
    public void updateBoard(Board board) {
        boardDao.update(board);
    }

    @Override
    public void deleteBoard(int id) {
        boardDao.delete(id);
    }

    @Override
    public Board getBoard(int id) {
        return boardDao.findById(id);
    }

    @Override
    public List<Board> getAllBoards() {
        return boardDao.findAll();
    }

    @Override
    public List<Board> getBoardsByUser_id(int id) {
        return boardDao.findByUser_id(id);
    }
}
