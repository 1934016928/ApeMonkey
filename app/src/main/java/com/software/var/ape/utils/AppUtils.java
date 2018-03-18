package com.software.var.ape.utils;

import android.content.Context;

import com.software.var.ape.ui.view.CenterToast;

/**
 * 工具类
 *
 * @author var
 * @date 2018/3/19.
 */

public class AppUtils {

    /**
     * 显示Toast提示框
     *
     * @param context 上下文参数
     * @param content 提示内容
     */
    public static void makeToast(Context context, String content) {
        CenterToast.INSTANCE.showToast(context, content);
    }

    /**
     * 显示Toast提示框
     *
     * @param context 上下文参数
     * @param id      提示内容的字符串资源ID
     */
    public static void makeToast(Context context, int id) {
        CenterToast.INSTANCE.showToast(context, id);
    }
}
