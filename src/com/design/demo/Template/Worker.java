package com.design.demo.Template;

import java.util.Date;

//抽象类，定义算法骨架
public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    //定义算法骨架，调用流程,不可变
    public final void wordDay(){
        System.out.println("work start --------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        leftCompany();
        System.out.println("work end ---------");
    }

    //钩子方法：逻辑判断，是否记录离开公司时间
    public boolean isNeedPrintDate(){
        return false; //默认不记录，子类如要记录，重写该方法即可
    }

    private void leftCompany(){
        if(isNeedPrintDate()){
            System.out.print(new Date().toString()+"---->");
        }
        System.out.println(name+"离开公司");
    }

    private void computerOff() {
        System.out.println(name+"关闭电脑");
    }

    public abstract void work();

    private void computerOn() {
        System.out.println(name+"打开电脑");
    }

    private void enterCompany() {
        System.out.println(name+"进入公司");
    }


}
