package com.lefer.service;

import com.lefer.common.Tools;
import com.lefer.domain.User;
import com.lefer.mapper.UserMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fang on 17-7-1.
 */
@Service
public class BbsUserDetailService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDetails loadUserByUsername(String userName) {
        if (StringUtils.isEmpty(userName)) {
            throw new UsernameNotFoundException("用户名为空！");
        }
        User user = userMapper.findByUsername(userName);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在！");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(new Tools().getRoleName(user.getUser_type())));
        LoggerFactory.getLogger(BbsUserDetailService.class).info("用户：" + user.getUser_name() + " 角色:" + user.getUser_type());

        return new org.springframework.security.core.userdetails.User(user.getUser_name(), user.getPassword(), authorities);
    }
}
