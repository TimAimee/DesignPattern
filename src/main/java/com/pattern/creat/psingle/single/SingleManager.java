package com.pattern.creat.psingle.single;

/**
 * Created by timaimee on 2017/4/15.
 */
public class SingleManager {
    private static SingleManager managerLazy = new SingleManager();
    private static SingleManager managerDoubleCheck;



    private SingleManager() {
    }

    static class SingleManagerInner {
        static SingleManager managerStaticInner = new SingleManager();
    }

    /**
     * 静态内部类
     *
     * @return
     */
    public static SingleManager getManagerStaticInner() {
        return SingleManagerInner.managerStaticInner;
    }

    /**
     * 双重校验
     * 进行两次null检查。 极大提升了并发度和性能。
     * 加锁前多进行一次null检查就可以减少绝大多数的加锁操作
     *
     * @return
     */
    public static SingleManager getSingleInstanceByDoubleCheck() {
        if (managerDoubleCheck == null) {
            synchronized (SingleManager.class) {
                if (managerDoubleCheck == null) {
                    managerDoubleCheck = new SingleManager();
                    return managerDoubleCheck;
                }
            }
        }
        return managerDoubleCheck;
    }

    /**
     * 饿汉写法
     *
     * @return
     */
    public static synchronized SingleManager getSingleInstanceByLazy() {
        return managerLazy;
    }


}

