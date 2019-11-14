package com.design.demo.Singleton;

public class HungrySingleton {
    //类一旦加载就创建
    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){};
    public static HungrySingleton getInstance(){
        return instance;
    }
}
