package com.design.demo.State;
//具体状态类：新建状态
public class New extends ThreadState {
    public New() {
        stateName = "新建状态";
        System.out.println("当前线程处于：新建状态。");
    }

    //定义能引起其发生变化的行为，这些行为在环境类中都有定义，可被调用
    public void start(ThreadContext hj){
        //传入环境，通过环境对象去更新其状态
        System.out.println("调用start方法 -->");
        if(stateName.equals("新建状态")){
            hj.setState(new Runnable());
        }else{
            System.out.println("当前线程不是新建状态，不能调用start方法。");
        }
    }
}
