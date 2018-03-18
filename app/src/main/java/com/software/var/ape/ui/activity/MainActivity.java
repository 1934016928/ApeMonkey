package com.software.var.ape.ui.activity;

import android.os.Bundle;

import com.software.var.ape.R;
import com.software.var.ape.ui.activity.base.AppActivity;

/**
 * 主界面
 *
 * @author var
 * @date 2018/3/18.
 */
public class MainActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.setCanBack();
    }
}
