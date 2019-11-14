package com.design.demo.State;
//具体状态类：阻塞状态
public class Blocked extends ThreadState {
    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态");
    }
    //恢复方法
    public void resume(ThreadContext hj){
        System.out.println("调用resume方法-->");
        if(stateName.equals("阻塞状态")){
            hj.setState(new Runnable());
        }else{
            System.out.println("当前线程不是阻塞状态，不能调用resume方法");
        }
    }
}
