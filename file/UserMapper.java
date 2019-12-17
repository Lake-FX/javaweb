package com.qimo.mapper;

import com.qimo.entrity.User;

public interface UserMapper {

    //查询数据库所有数据
    User selectAllUser();

    //根据id查询数据
    User selectUserById(int id);

    //登录验证
    User selectUser(User user);

    //插入新的数据
    void insertUser(User user);

    //更新数据（用于修改根据ID）
    void updateUserById(User user);

    //根据id删除数据
    void deteleUser(int id);
}
