package com.design.demo.Decorator.Equip;

import com.design.demo.Decorator.IEquip.IEquip;
//具体装备类
public class ShoeEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "疾跑鞋子";
    }
}
