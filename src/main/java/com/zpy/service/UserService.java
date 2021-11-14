package com.zpy.service;

import com.zpy.domain.User;

import java.util.List;

/**
 * @author zpy
 */
public interface UserService {

    List<User> findAll();

    void save(User user);
}
