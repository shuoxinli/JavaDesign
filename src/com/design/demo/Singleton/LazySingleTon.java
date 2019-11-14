package com.design.demo.Singleton;

public class LazySingleTon {
    //保证在所有线程中可见
    private static volatile LazySingleTon instance = null;
    //构造方式私有化
    private LazySingleTon(){}
    //同步方法获取实例
    public static synchronized LazySingleTon getInstance(){
        if(instance==null){
            instance = new LazySingleTon();
        }
        return instance;
    }
}
