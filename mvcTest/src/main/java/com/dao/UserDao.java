package com.dao;

import com.models.User;

import java.util.List;

public interface UserDao {

    List<User> userList();

    User getById(long id);
}
