package com.design.demo.Decorator.Decorator;

import com.design.demo.Decorator.IDecorator.IDecorator;
import com.design.demo.Decorator.IEquip.IEquip;

public class BlueDecorator implements IDecorator {

    //每个装饰品维护一个装备，表示可以为该装备装饰该宝石
    private IEquip equip;

    public BlueDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateAttack() {
        return 5 + equip.calculateAttack(); //加上该宝石的附加值
    }

    @Override
    public String description() {
        return equip.description() + "+ 蓝宝石"; //加上该宝石描述
    }
}
