package com.design.demo.State;

public class ThreadContext {
    //维护一个状态
    private ThreadState state;
    //初始化状态
    ThreadContext(){
        state = new New();
    }

    public ThreadState getState() {
        return state;
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    //向外提供能引起状态变化的方法
    public void start(){
        ((New)state).start(this);
    }
    public void getCPU(){
        ((Runnable)state).getCPU(this);
    }
    public void suspend(){
        ((Running)state).suspend(this);
    }
    public void stop(){
        ((Running)state).stop(this);
    }
    public void resume(){
        ((Blocked)state).resume(this);
    }
}
