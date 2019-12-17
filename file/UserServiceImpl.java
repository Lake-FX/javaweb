package com.qimo.service.impl;

import com.qimo.entrity.User;
import com.qimo.mapper.UserMapper;
import com.qimo.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SqlSession sqlSession;
    @Override
    @Transactional(readOnly = true)
    public User selectAllUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectAllUser();
        return user;
    }

    @Override
    @Transactional(readOnly = true)
    public User selectUserById(int id) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(id);
        return user;
    }

    @Override
    @Transactional(readOnly = true)
    public User selectUser(User user) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User res_user = userMapper.selectUser(user);
        return res_user;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public User insertUser(User user) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertUser(user);
        return user;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUserById(User user) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUserById(user);

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deteleUser(int id) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deteleUser(id);
    }
}
