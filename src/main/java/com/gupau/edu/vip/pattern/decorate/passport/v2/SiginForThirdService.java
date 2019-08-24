package com.gupau.edu.vip.pattern.decorate.passport.v2;

import com.gupau.edu.vip.pattern.decorate.passport.Member;
import com.gupau.edu.vip.pattern.decorate.passport.ResultMsg;
import com.gupau.edu.vip.pattern.decorate.passport.v1.SigninService;

import java.sql.ResultSet;

/**
 * SiginForThirdService类
 *
 * @author wangjixue
 * @date 2019-08-24 14:33
 */
public interface SiginForThirdService extends SigninService {
    /**
     * QQ登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg<Member>loginForQQ(String username, String password);

    /**
     * 微信登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg<Member>loginForWechat(String username, String password);

    /**
     * 手机登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg<Member>loginForTelphone(String username, String password);

    /**
     * 单点登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg<Member>loginForToken(String username, String password);

    /**
     * 注册自动登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg<Member>loginForRegist(String username, String password);


}
