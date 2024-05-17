package org.roylin.springbootmall.dao;

import org.roylin.springbootmall.dto.UserRegisterRequest;
import org.roylin.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
