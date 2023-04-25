package com.redis1.service;

import com.redis1.entity.User;

import java.util.List;

public interface UserService {
    User getUser(long id);

    List<User> getAll();

    void delete(long id);

    User update(User user);

    User create(User user);
}
