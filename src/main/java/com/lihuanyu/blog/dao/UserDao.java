package com.lihuanyu.blog.dao;

import com.lihuanyu.blog.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by skyADMIN on 16/7/10.
 */
public interface UserDao extends CrudRepository<User, Integer> {
    public Iterable<User> findByUsername(String username);
}
