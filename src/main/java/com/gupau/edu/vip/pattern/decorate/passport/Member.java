package com.gupau.edu.vip.pattern.decorate.passport;

import lombok.Data;

/**
 * Member类
 *
 * @author wangjixue
 * @date 2019-08-24 13:38
 */
@Data
public class Member {

    private String username;
    private String password;
    private String mid;
    private String info;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
        System.err.println(username+"--"+password);
    }
}
