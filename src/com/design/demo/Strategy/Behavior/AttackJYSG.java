package com.design.demo.Strategy.Behavior;

import com.design.demo.Strategy.IBehavior.IAttackBehavior;

//这是一个具体的攻击技能，每个角色的攻击技能可以不一样
public class AttackJYSG implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("九阳神功");
    }
}
