package com.ethan.chapter2;

/**
 * 实现单例模式
 */
public class Singleton {
  private static Singleton instance;

  private Singleton() {
  }

  public static Singleton getInstance() {
    // 判断为空,避免不必要的同步
    if (instance == null) {
      synchronized (Singleton.class) {
        // 加同步锁创建单例
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
