package com.software.var.ape.threads;

import com.software.var.ape.ui.activity.StartActivity;

/**
 * 启动页的初始化线程
 *
 * @author var
 * @date 2018/3/19.
 */

public class LaunchThread extends Thread {

    /*启动界面*/
    private StartActivity activity;

    /**
     * 构造方法
     *
     * @param activity 启动界面对象实例
     */
    public LaunchThread(StartActivity activity) {
        this.activity = activity;
    }

    @Override
    public void run() {
        if (activity != null) {
            activity.init();
            activity.initOk();
        }
    }
}
