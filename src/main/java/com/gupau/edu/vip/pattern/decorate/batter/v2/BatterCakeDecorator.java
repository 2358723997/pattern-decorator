package com.gupau.edu.vip.pattern.decorate.batter.v2;

/**
 * BatterCakeDecorator类
 * 装饰者模式
 * @author wangjixue
 * @date 2019-08-24 13:55
 */
public abstract class BatterCakeDecorator extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }
    @Override
    public String getMsg() {
        return this.batterCake.getMsg();
    }
    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }
}
