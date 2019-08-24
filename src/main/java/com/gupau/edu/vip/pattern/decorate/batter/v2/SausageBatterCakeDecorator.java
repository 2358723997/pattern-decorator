package com.gupau.edu.vip.pattern.decorate.batter.v2;

/**
 * BaseBatterCake类
 *
 * @author wangjixue
 * @date 2019-08-24 14:01
 */
public class SausageBatterCakeDecorator extends BatterCakeDecorator {

    public SausageBatterCakeDecorator(BatterCake batterCake) {
        super(batterCake);
    }


    public String getMsg() {
        return super.getMsg() + "+ 1个烤肠";
    }

    public int getPrice() {
        return super.getPrice() + 2;
    }
}
