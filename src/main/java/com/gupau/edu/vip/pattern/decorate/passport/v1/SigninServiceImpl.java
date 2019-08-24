package com.gupau.edu.vip.pattern.decorate.passport.v1;

import com.gupau.edu.vip.pattern.decorate.passport.Member;
import com.gupau.edu.vip.pattern.decorate.passport.ResultMsg;

/**
 * SigninService类
 *
 * @author wangjixue
 * @date 2019-08-24 14:14
 */
public class SigninServiceImpl implements SigninService{

    /**
     * 注册
     * @param userame
     * @param password
     * @return
     */
    public ResultMsg<Member> regist(String userame, String password){
        return new ResultMsg<Member>(200,true,"注册成功",new Member(userame,password));
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg<Member> login(String username, String password){
        return null;
    }
}
