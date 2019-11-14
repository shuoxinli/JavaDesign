package com.design.demo.State;
//具体状态类：运行状态
public class Running extends ThreadState {
    public Running() {
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态。");
    }
    //阻塞方法
    public void suspend(ThreadContext hj){
        System.out.println("调用suspend方法-->");
        if(stateName.equals("运行状态")){
            hj.setState(new Blocked());
        }else{
            System.out.println("当前线程不是运行状态，不能调用suspend方法");
        }
    }

    //停止方法
    public void stop(ThreadContext hj){
        System.out.println("调用stop方法-->");
        if(stateName.equals("运行状态")){
            hj.setState(new Dead());
        }else{
            System.out.println("当前状态不是运行状态，不能调用stop方法");
        }
    }
}
