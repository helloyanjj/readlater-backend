package com.nju.readlaterbackend.user;

import com.nju.readlaterbackend.user.data.User;
import com.nju.readlaterbackend.user.dto.UserRespository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.text.DecimalFormat;

/**
 * created by yanjunjie
 */
@Component
public class UserManagement {
    @Inject
    private UserRespository userRespository;

    public Boolean validateUser(User user) {
        if (userRespository.findUserByUserId(user.getUserId()) != null) {
            return true;
        }
        return false;
    }

    public void addUser(User user) {
        user.setUserName("--");
        userRespository.save(user);
    }


}

