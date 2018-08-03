package com.mmall.common;

/**
 * @Project: mmall
 * @Description:
 * @Author: Cenjie
 * @Date: Created in 2018/8/2
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";

    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOMER = 0;  //普通用户
        int ROLE_ADMIN = 1; //管理员
    }
}
