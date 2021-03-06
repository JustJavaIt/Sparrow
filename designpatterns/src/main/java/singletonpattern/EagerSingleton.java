package singletonpattern;

/**
 * 饿汉单例
 * 类加载时创建单例对象，以空间换时间。
 * @author Sparrow
 */

public class EagerSingleton {

    /**
     * 构造方法私有化
     * 私有的构造器 使该单例类不会被外部创建
     * 除了反射调用
     */
    private EagerSingleton() {
    }

    /**
     * 实例化的变量引用私有化
     * 使该单例类在类加载初始化的时候便创建一个饿汉单例静态对象提供内部使用
     */
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    /**
     * 获取实例的方法共有
     * 提供外部调用私有的饿汉单例
     * @return eagerSingleton 饿汉单例
     */
    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }

}
