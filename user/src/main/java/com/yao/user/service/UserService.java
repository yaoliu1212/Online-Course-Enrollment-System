package com.yao.user.service;

import com.yao.user.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    User findByUsername(String username);
    List<String> findUsersByIdList(List<Long> idList);
}
