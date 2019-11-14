package com.design.demo.Template;
//具体子类
public class ITWorker extends Worker {

    public ITWorker(String name){
        super(name);
    }

    //重写抽象方法，每个职位都是不同的工作
    @Override
    public void work() {
        System.out.println(name+"写程序 - 调Bug - fix Bug");
    }

    public boolean isNeedPrintDate(){
        return true;
    }
}
