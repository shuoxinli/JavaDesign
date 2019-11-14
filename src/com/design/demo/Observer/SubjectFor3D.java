package com.design.demo.Observer;

import java.util.Observable;

//这是一个3D彩票服务号主题。
public class SubjectFor3D extends Observable {
    private String msg;

    public String getMsg(){
        return msg;
    }

    //主题更新消息
    public void setMsg(String msg){
        this.msg = msg;
        //使用Java的内置类方法来通知所有的观察者
        setChanged();
        //notify会去调用所有订阅该主题的使用者的update方法，更新消息
        notifyObservers();
    }
}
