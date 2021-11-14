package com.zpy.service.impl;

import com.zpy.domain.User;
import com.zpy.mapper.UserMapper;
import com.zpy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zpy
 */
@Service
@Transactional(rollbackFor = Throwable.class, value = "myTransactionManager")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }
}
