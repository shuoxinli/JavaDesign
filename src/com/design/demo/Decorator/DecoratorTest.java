package com.design.demo.Decorator;

import com.design.demo.Decorator.Decorator.BlueDecorator;
import com.design.demo.Decorator.Decorator.GreenDecorator;
import com.design.demo.Decorator.Decorator.RedDecorator;
import com.design.demo.Decorator.Equip.RingEquip;
import com.design.demo.Decorator.IEquip.IEquip;

public class DecoratorTest {
    public static void main(String[] args){
        System.out.println("一个镶嵌了一颗红宝石，一颗蓝宝石，一颗绿宝石的戒指");
        //这个是关键，通过不断装饰类去实现,装备类放在最内层
        IEquip equip = new RedDecorator(new BlueDecorator(new GreenDecorator(new RingEquip())));
        System.out.println("攻击力："+ equip.calculateAttack());
        System.out.println("描述："+ equip.description());
    }
}
