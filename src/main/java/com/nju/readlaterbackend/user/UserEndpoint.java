package com.nju.readlaterbackend.user;

import com.nju.readlaterbackend.share.data.AddRequest;
import com.nju.readlaterbackend.share.data.ShareContent;
import com.nju.readlaterbackend.user.data.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.List;

/**
 * created by yanjunjie
 */
@RestController
public class UserEndpoint {
    @Inject
    private UserManagement userManagement;

    @POST
    @RequestMapping("registerUser")
    public boolean registerUser(@RequestBody User user) {


        return userManagement.addUser(user);
    }

    @GET
    @RequestMapping("validateUser")
    public boolean validateUser(@RequestBody User user) {
        return userManagement.validateUser(user);
    }

    @POST
    @RequestMapping("loginWithPwd")
    public String loginWithPwd(@RequestBody User user) {


        return userManagement.loginValid(user);
    }
}

