package com.software.var.ape.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.software.var.ape.R;

/**
 * 自定义提示框
 *
 * @author var
 * @date 2018/3/19.
 */

public enum CenterToast {
    @SuppressLint("StaticFieldLeak")
    INSTANCE;
    private Toast mToast;
    private TextView mTextView;

    /**
     * 显示Toast
     *
     * @param context 上下文参数
     * @param content 显示内容
     */
    public void showToast(Context context, String content) {
        if (mToast == null) {
            mToast = new Toast(context);
            mToast.setDuration(Toast.LENGTH_SHORT);
            mToast.setGravity(Gravity.CENTER, 0, 0);
            @SuppressLint("InflateParams")
            View view = LayoutInflater.from(context).inflate(R.layout.view_control_toast, null);
            mTextView = view.findViewById(R.id.view_toast_tv);
            mToast.setView(view);
            mTextView.setText(content);
            mToast.show();
        }
        mTextView.setText(content);
        mToast.show();
    }

    /**
     * 显示Toast
     *
     * @param context 上下文参数
     * @param id      字符串资源ID
     */
    public void showToast(Context context, int id) {
        showToast(context, context.getString(id));
    }
}
