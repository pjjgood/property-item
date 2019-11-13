package com.qf.dao;


import com.qf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserResponsitory extends JpaRepository<User, Integer> {

    User findUserByUsername(String username);

    User findUserByTel(String tel);


}
