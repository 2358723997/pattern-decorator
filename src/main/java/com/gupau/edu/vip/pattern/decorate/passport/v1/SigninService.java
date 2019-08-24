package com.gupau.edu.vip.pattern.decorate.passport.v1;

import com.gupau.edu.vip.pattern.decorate.passport.Member;
import com.gupau.edu.vip.pattern.decorate.passport.ResultMsg;

/**
 * SigninService类
 *
 * @author wangjixue
 * @date 2019-08-24 14:14
 */
public interface SigninService{

    /**
     * 注册
     * @param userame
     * @param password
     * @return
     */
    ResultMsg<Member> regist(String userame,String password);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg<Member> login(String username,String password);
}
