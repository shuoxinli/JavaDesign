package com.design.demo.Observer;

public class ObserverTest {
    public static void main(String[] args){

        //创建两个主题
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();
        SubjectFor3D subjectFor3D = new SubjectFor3D();

        //创建观察者
        Observer1 observer1 = new Observer1();
        //订阅主题
        observer1.registerSubject(subjectFor3D);
        observer1.registerSubject(subjectForSSQ);

        //主题更新消息
        subjectFor3D.setMsg("hello, this is 3d.");
        subjectForSSQ.setMsg("hello,this is SSQ.");
    }
}
