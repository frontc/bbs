package com.lefer.mapper;

import com.lefer.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by fang on 17-7-1.
 */
@Mapper
@Repository
public interface UserMapper {
    @Select("select * from t_user where user_name= #{userName}")
    User findByUsername(@Param("userName") String userName);

    @Select("select count(*) from t_user where user_name=#{userName) and password=#{password}")
    int getMatchCount(@Param("userName") String userName,@Param("password") String password);

}
