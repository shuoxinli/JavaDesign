package com.design.demo.Strategy.Role;

import com.design.demo.Strategy.IBehavior.IAttackBehavior;
import com.design.demo.Strategy.IBehavior.IDefendBehavior;
import com.design.demo.Strategy.IBehavior.IDisplayBehavior;
import com.design.demo.Strategy.IBehavior.IRunBehavior;

//这是游戏角色的超类，每个角色都要继承该类
public abstract class Role {
    public String name;

    public IDisplayBehavior displayBehavior;
    public IAttackBehavior attackBehavior;
    public IDefendBehavior defendBehavior;
    public IRunBehavior runBehavior;

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    public Role setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    public void display(){
        displayBehavior.display();
    }

    public void run(){
        runBehavior.run();
    }

    public void attack(){
        attackBehavior.attack();
    }

    public void defend(){
        defendBehavior.defend();
    }
}
