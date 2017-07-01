package com.lefer.config;

import com.lefer.service.BbsUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Created by fang on 17-7-1.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true,jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    private BbsUserDetailService bbsUserDetailService;

    @Autowired
    public void setBbsUserDetailService(BbsUserDetailService bbsUserDetailService){
        this.bbsUserDetailService=bbsUserDetailService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/","/index","/topic","/topic_list").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/loginPage").loginProcessingUrl("/login").permitAll()
                .and().logout().logoutSuccessUrl("/").permitAll()
                .and().httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{
        /*authenticationManagerBuilder
                .inMemoryAuthentication()
                .withUser("root")
                .password("root")
                .roles("USER");*/
        authenticationManagerBuilder.userDetailsService(bbsUserDetailService);
    }
}
