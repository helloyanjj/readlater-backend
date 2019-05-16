package com.nju.readlaterbackend.user;

import com.nju.readlaterbackend.user.data.MD5Utils;
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

    public boolean addUser(User user) {
        user.setUserName("--");
        try {
            userRespository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public String loginValid(User user) {
        User userValid = userRespository.findUserByUserId(user.getUserId());
        if (userValid == null) {
            return "1";
        } else if (user.getPassword() != userValid.getPassword()) {
            return "2";
        } else return "3";
    }

    public String encryToken(User user) {


        return "";
    }


}

