package com.lefer.service;

import com.lefer.domain.User;
import com.lefer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fang on 17-7-1.
 */
@Service
public class LoginService {
    private UserMapper userMapper;

    public User findUserByUsername(String userName){
        return userMapper.findByUsername(userName);
    }

    public Boolean hasMatchUser(String userName,String password){
        return userMapper.getMatchCount(userName,password)>0;
    }

    public void loginSuccess(User user){

    }


    @Autowired
    public void setUserMapper(UserMapper userMapper){
        this.userMapper=userMapper;
    }
}
