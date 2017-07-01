package com.lefer.common;

/**
 * Created by fang on 17-7-1.
 */
public class Tools {
    public String getRoleName(Long userType){
        if(userType==1){
            return "ROLE_USER";
        }else if (userType==2){
            return "ROLE_ADMIN";
        }else{
            return "ROLE_UNKNOWN";
        }
    }
}
