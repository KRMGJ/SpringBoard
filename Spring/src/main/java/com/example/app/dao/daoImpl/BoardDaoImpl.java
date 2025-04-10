package com.example.app.dao.daoImpl;

import com.example.app.dao.BoardDao;
import com.example.app.model.Board;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDaoImpl implements BoardDao {

    @Autowired
    SqlSession sqlSession;

    @Override
    public void save(Board board) {
        sqlSession.insert("Board.save", board);
    }

    @Override
    public List<Board> findAll() {
        return sqlSession.selectList("Board.findAll");
    }

    @Override
    public Board findById(int id) {
        return sqlSession.selectOne("Board.findById", id);
    }

    @Override
    public void update(Board board) {
        sqlSession.update("Board.update", board);
    }

    @Override
    public void delete(int id) {
        sqlSession.delete("Board.delete", id);
    }
}
