package com.design.demo.Proxy;

public class ProxyTest {
    public static void main(String[] args){
        Proxy proxy = new Proxy();
        proxy.request();
    }
}

//抽象主题
interface Subject{
    void request();
}
//真实主题
class RealSubject implements Subject{
    public void request(){
        System.out.println("访问真实主题");
    }
}
//代理
class Proxy implements Subject{
    //通过组合的方式去调用真实主题的方法
    private RealSubject realSubject;
    public void request(){
        if(realSubject==null){
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }
    public void preRequest(){
        System.out.println("访问真实主题前的处理");
    }
    public void postRequest(){
        System.out.println("访问真实主题后的处理");
    }
}
