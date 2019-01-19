package com.nf147.platform.dao;

import com.nf147.platform.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
}
