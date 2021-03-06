package com.qf.dao;

import com.qf.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateByTel(User user);

    List<User> findUsers();

    Integer updateUser(User user);

    Integer selectUserById(Integer userId);

    List<User> findUserToPay();

}