package com.design.demo.Builder;

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show(){
        //显示产品的特性
        System.out.println("这是产品的特性:" + partA+" "+partB+" "+partC);
    }
}
