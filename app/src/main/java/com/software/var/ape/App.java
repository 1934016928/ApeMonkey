package com.software.var.ape;

import android.app.Activity;
import android.app.Application;

import com.software.var.ape.threads.pool.ThreadPool;

import java.util.ArrayList;
import java.util.List;

/**
 * 程序启动前的初始化类
 *
 * @author var
 * @date 2018/3/18.
 */

public class App extends Application {

    /*声明并初始化Activity的储存集合*/
    private static List<Activity> acts = new ArrayList<>();

    /**
     * 添加Activity对象到管理列表
     *
     * @param activity Activity对象
     */
    public static void addAct(Activity activity) {
        if (activity != null) {
            App.acts.add(activity);
        }
    }

    /**
     * 销毁Activity对象并从管理列表中删除
     *
     * @param activity Activity对象
     */
    public static void delAct(Activity activity) {
        if (activity != null) {
            App.acts.remove(activity);
        }
    }

    /**
     * 程序退出,并销毁所有Activity,关闭线程池等
     */
    public static void exit() {
        for (Activity act : App.acts) {
            if (act != null) {
                act.finish();
            }
        }
        App.acts.clear();
        ThreadPool.close();
        System.exit(0);
    }
}
