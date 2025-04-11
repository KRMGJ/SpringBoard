package com.example.app.dao.daoImpl;

import com.example.app.dao.UserDao;
import com.example.app.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    SqlSession sqlSession;

    @Override
    public void save(User user) {
        sqlSession.insert("User.save", user);
    }

    @Override
    public User findByUserId(String userId) {
        return sqlSession.selectOne("User.findByUserId", userId);
    }

    @Override
    public List<User> findAll() {
        return sqlSession.selectList("User.findAll");
    }

    @Override
    public void update(User user) {
        sqlSession.update("User.update", user);
    }

    @Override
    public void delete(String userId) {
        sqlSession.delete("User.delete", userId);
    }
}
