package com.design.demo.Strategy;

import com.design.demo.Strategy.Behavior.AttackJYSG;
import com.design.demo.Strategy.Behavior.DefendTBS;
import com.design.demo.Strategy.Behavior.DisplayA;
import com.design.demo.Strategy.Behavior.RunJCTQ;
import com.design.demo.Strategy.Role.Role;
import com.design.demo.Strategy.Role.RoleA;

/*
    策略模式：就是把每个技能抽取出来，实现多种具体的技能，然后每个角色需要什么技能直接可以复用。
    抽象一个角色类，定义基础方法，然后每个角色都要继承该类，传入具体的技能实现类。
    后期如果要增加什么样的角色，只需要动态设置一下具体的技能和展示的方法。
 */
public class StrategyTest {
    public static void main(String[] args){
        //创建一个具体的角色类
        Role roleA = new RoleA("A");
        //设置该角色的具体行为
        roleA.setAttackBehavior(new AttackJYSG())
                .setDefendBehavior(new DefendTBS())
                .setDisplayBehavior(new DisplayA())
                .setRunBehavior(new RunJCTQ());
        System.out.println(roleA.name + ":");
        roleA.display();
        roleA.attack();
        roleA.defend();
        roleA.run();
    }
}
