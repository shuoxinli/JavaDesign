package com.design.demo.Observer;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer {

    //订阅主题
    public void registerSubject(Observable observable){
        //将自身注册到所要订阅的主题中
        observable.addObserver(this);
    }

    //更新主题消息
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof SubjectFor3D){
            SubjectFor3D subjectFor3D = (SubjectFor3D) o;
            System.out.println("subjectFor3D's msg -->" + subjectFor3D.getMsg());
        }
        if(o instanceof SubjectForSSQ){
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ's msg -->" + subjectForSSQ.getMsg());
        }
    }
}
