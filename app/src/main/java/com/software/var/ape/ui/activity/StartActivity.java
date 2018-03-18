package com.software.var.ape.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.software.var.ape.R;
import com.software.var.ape.threads.LaunchThread;
import com.software.var.ape.threads.ThreadPool;
import com.software.var.ape.ui.activity.base.AppActivity;

/**
 * 启动页
 *
 * @author var
 * @date 2018/3/18.
 */
public class StartActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_start);
        /*启动初始化线程*/
        ThreadPool.execute(new LaunchThread(this));
    }

    /**
     * 初始化方法,该方法由初始化线程调用
     */
    public void init() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化完成后调用,该方法由初始化线程调用
     */
    public void initOk() {
        this.startActivity(new Intent(this, MainActivity.class));
        this.finish();
    }
}
