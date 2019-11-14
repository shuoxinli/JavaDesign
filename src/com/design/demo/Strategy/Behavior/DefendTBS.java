package com.design.demo.Strategy.Behavior;

import com.design.demo.Strategy.IBehavior.IDefendBehavior;

//这是一个防御技能
public class DefendTBS implements IDefendBehavior {
    @Override
    public void defend() {
        System.out.println("铁布衫");
    }
}
