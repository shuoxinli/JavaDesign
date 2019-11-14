package com.design.demo.Decorator.Equip;

import com.design.demo.Decorator.IEquip.IEquip;

public class RingEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}
