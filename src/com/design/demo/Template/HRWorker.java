package com.design.demo.Template;
//具体子类
public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name+"看简历 - 打电话 - 接电话");
    }
}
