package com.nju.readlaterbackend.user.dto;

import com.nju.readlaterbackend.user.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRespository extends JpaRepository<User, Long> {

    User findUserByUserId(String userId);



}
