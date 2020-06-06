package com.mabf.dao;

import com.mabf.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

}
