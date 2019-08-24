package com.gupau.edu.vip.pattern.decorate.passport.v2;

import com.gupau.edu.vip.pattern.decorate.passport.Member;
import com.gupau.edu.vip.pattern.decorate.passport.ResultMsg;
import com.gupau.edu.vip.pattern.decorate.passport.v1.SigninService;

/**
 * SiginForThirdService类
 *
 * @author wangjixue
 * @date 2019-08-24 14:33
 */
public class SiginForThirdServiceImpl implements SiginForThirdService {

    private SigninService service;

    public SiginForThirdServiceImpl(SigninService service) {
        this.service = service;
    }

    /**
     * QQ登录
     * @param username
     * @param password
     * @return
     */
   public ResultMsg<Member>loginForQQ(String username, String password){
        return null;
    }

    /**
     * 微信登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg<Member>loginForWechat(String username, String password){
        return null;
    }

    /**
     * 手机登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg<Member>loginForTelphone(String username, String password){
        return null;
    }

    /**
     * 单点登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg<Member>loginForToken(String username, String password){
        return null;
    }

    /**
     * 注册自动登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg<Member>loginForRegist(String username, String password){
        return null;
    }


    public ResultMsg<Member> regist(String userame, String password) {
        return service.regist(userame,password);
    }

    public ResultMsg<Member> login(String username, String password) {
        return service.login(username,password);
    }
}
