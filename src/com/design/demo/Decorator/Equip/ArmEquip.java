package com.design.demo.Decorator.Equip;

import com.design.demo.Decorator.IEquip.IEquip;

//具体装备
public class ArmEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
