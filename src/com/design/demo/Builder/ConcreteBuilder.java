package com.design.demo.Builder;
//具体建造者：实现了抽象建造者接口
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("build A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("build B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("build C");
    }
}
