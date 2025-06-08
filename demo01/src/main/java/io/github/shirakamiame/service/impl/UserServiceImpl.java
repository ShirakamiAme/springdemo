package io.github.shirakamiame.service.impl;

import io.github.shirakamiame.entity.User;
import io.github.shirakamiame.mapper.UserMapper;
import io.github.shirakamiame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String username) {
        return userMapper.login(username);
    }
}
