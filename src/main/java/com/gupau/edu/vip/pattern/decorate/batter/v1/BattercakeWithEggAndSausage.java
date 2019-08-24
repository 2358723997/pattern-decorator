package com.gupau.edu.vip.pattern.decorate.batter.v1;

/**
 * BatterCake类
 *
 * @author wangjixue
 * @date 2019-08-24 13:38
 */
public class BattercakeWithEggAndSausage extends BatterCakeWithEgg {
    public String getMsg(){
        return super.getMsg()+"+1根烤肠";
    }
    public int getPrice(){
        return super.getPrice()+2;
    }
}
