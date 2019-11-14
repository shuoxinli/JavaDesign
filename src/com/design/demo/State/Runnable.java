package com.design.demo.State;
//具体状态类：就绪状态
public class Runnable extends ThreadState {
    public Runnable() {
        stateName = "就绪状态";
        System.out.println("当前线程处于：就绪状态");
    }

    //获取cpu能引起该状态变化
    public void getCPU(ThreadContext hj){
        System.out.println("获取CPU时间-->");
        if(stateName.equals("就绪状态")){
            //获取到，改变环境的状态
            hj.setState(new Running());
        }else{
            System.out.println("当前线程不是就绪状态，不能获取CPU");
        }
    }
}
