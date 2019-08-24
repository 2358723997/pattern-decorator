package com.gupau.edu.vip.pattern.decorate.batter.v2;

/**
 * BaseBatterCake类
 *
 * @author wangjixue
 * @date 2019-08-24 14:01
 */
public class EggBatterCakeDecorator extends BatterCakeDecorator {

    public EggBatterCakeDecorator(BatterCake batterCake) {
        super(batterCake);
    }


    public String getMsg() {
        return super.getMsg() + "+ 1个鸡蛋";
    }

    public int getPrice() {
        return super.getPrice() + 1;
    }
}
