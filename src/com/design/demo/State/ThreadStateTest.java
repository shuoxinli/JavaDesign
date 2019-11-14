package com.design.demo.State;

public class ThreadStateTest {
    public static void main(String[] args){
        //创建一个环境对象
        ThreadContext hj = new ThreadContext();
        //通过环境对象去调用引起状态变化的方法
        hj.start();
        hj.getCPU();
        hj.suspend();
        hj.resume();
        hj.getCPU();
        hj.stop();
    }
}

