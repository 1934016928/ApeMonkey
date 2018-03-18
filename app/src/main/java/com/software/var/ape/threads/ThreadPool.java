package com.software.var.ape.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 *
 * @author var
 * @date 2018/3/19.
 */

public class ThreadPool {

    /*声明并初始化线程池*/
    private static ExecutorService threadPool = Executors.newCachedThreadPool();

    /**
     * 添加并执行线程
     *
     * @param thread 线程对象
     */
    public static void execute(Thread thread) {
        if (thread != null) {
            threadPool.execute(thread);
        }
    }

    /**
     * 关闭线程池
     */
    public static void close() {
        if (threadPool != null) {
            threadPool.shutdown();
        }
    }
}
