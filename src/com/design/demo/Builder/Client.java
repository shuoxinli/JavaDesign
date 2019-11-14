package com.design.demo.Builder;

public class Client {
    public static void main(String[] args){
        //创建一个建造者
        Builder builder = new ConcreteBuilder();
        //创建一个指挥者
        Director director = new Director(builder);
        //调用指挥者去构建产品
        Product product = director.construct();
        product.show();
    }
}
