package cn.Engulf.dao;

import cn.Engulf.domain.User;

import java.util.List;

/**
 * 用户操作的DAO
 */

public interface UserDao {
    public List<User> findAll();
}
