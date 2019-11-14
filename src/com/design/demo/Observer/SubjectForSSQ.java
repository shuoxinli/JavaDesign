package com.design.demo.Observer;

import java.util.Observable;
//这是一个双色球的主题号
public class SubjectForSSQ extends Observable {
    private String msg;
    public String getMsg(){
        return msg;
    }

    //主题更新消息
    public void setMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
