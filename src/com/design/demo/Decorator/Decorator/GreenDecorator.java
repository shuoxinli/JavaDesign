package com.design.demo.Decorator.Decorator;

import com.design.demo.Decorator.IDecorator.IDecorator;
import com.design.demo.Decorator.IEquip.IEquip;

public class GreenDecorator implements IDecorator {

    //每个装饰品维护一个装备，表示可以为该装备装饰该宝石
    private IEquip equip;

    public GreenDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateAttack() {
        return 15 + equip.calculateAttack(); //加上该宝石的附加值
    }

    @Override
    public String description() {
        return equip.description() + "+ 绿宝石"; //加上该宝石描述
    }
}
