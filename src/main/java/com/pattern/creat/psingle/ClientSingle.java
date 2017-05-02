package com.pattern.creat.psingle;

import com.pattern.creat.psingle.single.SingleManage;
import com.pattern.creat.psingle.single.SingleManager;

/**
 * [Type-Create] Single Pattern
 *
 * Created by timaimee on 2017/4/15.
 */
public class ClientSingle {
    public static void main(String[] args) {

        /**
         * 静态内部类
         */
        new Thread(new CreateInnnerThread()).start();
        new Thread(new CreateInnnerThread()).start();
        new Thread(new CreateInnnerThread()).start();
        /**
         * 双重校验
         */
        new Thread(new CreateDoubleCheckThread()).start();
        new Thread(new CreateDoubleCheckThread()).start();
        new Thread(new CreateDoubleCheckThread()).start();
        /**
         * 懒汉
         */
        new Thread(new CreateLazyThread()).start();
        new Thread(new CreateLazyThread()).start();
        new Thread(new CreateLazyThread()).start();
        /**
         * 枚举
         */
        new Thread(new CreateEnumThread()).start();
        new Thread(new CreateEnumThread()).start();
        new Thread(new CreateEnumThread()).start();
    }

    static class CreateInnnerThread implements Runnable {
        @Override
        public void run() {
            System.out.println("静态内部类:" + SingleManager.getManagerStaticInner());
        }
    }

    static class CreateDoubleCheckThread implements Runnable {
        @Override
        public void run() {
            System.out.println("双重校验:" + SingleManager.getSingleInstanceByDoubleCheck());
        }
    }

    static class CreateLazyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("懒汉:" + SingleManager.getSingleInstanceByLazy());
        }
    }

    static class CreateEnumThread implements Runnable {
        @Override
        public void run() {
            System.out.println("枚举:" + SingleManage.INSTANCE.toString());
        }
    }

}


