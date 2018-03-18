package com.software.var.ape.ui.activity.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

import com.software.var.ape.App;
import com.software.var.ape.R;
import com.software.var.ape.utils.AppUtils;

/**
 * 基础Activity类,所有Activity均继承此类
 *
 * @author var
 * @date 2018/3/18.
 */

@SuppressLint("Registered")
public class AppActivity extends AppCompatActivity {

    /*当用户点击返回建的时候是否可返回*/
    private boolean canBack = true;
    /*记录用户第一次点击Back键的时间*/
    private long clickTime = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.addAct(this);
    }

    @Override
    public void finish() {
        App.delAct(this);
        super.finish();
    }

    /**
     * 设置当前Activity是否可以回退到上一个Activity,默认true,即可回退
     */
    public void setCanBack() {
        this.canBack = false;
    }

    /**
     * 监听用户点击事件,用户双击Back时,程序退出
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (canBack) {
            return false;
        }
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            long nowTime = System.currentTimeMillis();
            if (nowTime - clickTime > 2000) {
                AppUtils.makeToast(this, R.string.toast_double_click_exit);
                clickTime = nowTime;
            } else {
                App.exit();
            }
        }
        return true;
    }
}
