package com.design.demo.Builder;
//指挥者：调用建造者中的方法完成复杂对象的创建
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    //产品构建和组装
    public Product construct(){
        //调用建造者的方法来构建产品
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
