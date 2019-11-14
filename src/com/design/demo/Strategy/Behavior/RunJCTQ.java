package com.design.demo.Strategy.Behavior;

import com.design.demo.Strategy.IBehavior.IRunBehavior;

//这是一个逃跑技能
public class RunJCTQ implements IRunBehavior {
    @Override
    public void run() {
        System.out.println("金蝉脱壳");
    }
}
