package com.design.demo.Strategy.Behavior;

import com.design.demo.Strategy.IBehavior.IDisplayBehavior;

//这是一个展示外表的技能
public class DisplayA implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("样子A");
    }
}
