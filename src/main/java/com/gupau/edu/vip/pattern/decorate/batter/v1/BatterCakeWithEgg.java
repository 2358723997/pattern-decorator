package com.gupau.edu.vip.pattern.decorate.batter.v1;

/**
 * BatterCake类
 *
 * @author wangjixue
 * @date 2019-08-24 13:38
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
