package com.design.demo.Decorator.Decorator;

import com.design.demo.Decorator.IDecorator.IDecorator;
import com.design.demo.Decorator.IEquip.IEquip;

public class RedDecorator implements IDecorator {

    //每个装饰品维护一个装备，表示可以为该装备装饰该宝石
    private IEquip equip;

    public RedDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateAttack() {
        return 10 + equip.calculateAttack(); //加上该宝石的附加值
    }

    @Override
    public String description() {
        return equip.description() + "+ 红宝石"; //加上该宝石描述
    }
}
