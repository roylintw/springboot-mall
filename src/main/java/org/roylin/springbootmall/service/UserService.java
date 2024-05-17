package org.roylin.springbootmall.service;

import org.roylin.springbootmall.dto.UserLoginRequest;
import org.roylin.springbootmall.dto.UserRegisterRequest;
import org.roylin.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    // 11-20
    User login(UserLoginRequest userLoginRequest);
}
