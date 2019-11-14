package com.design.demo.Prototype;

//Realizetype是具体的实现原型，Cloneable接口是抽象的原型类。
class Realizetype implements Cloneable {
    Realizetype(){
        System.out.println("具体原型创建成功！");
    }

    //实现clone方法，表明是可被复制的对象
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}
public class PrototypeTest{
    public static void main(String[] args) throws CloneNotSupportedException{
        Realizetype obj1 = new Realizetype();
        //调用具体的原型类中的clone来复制新的对象。
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1==obj2?"+ (obj1==obj2));
    }
}
