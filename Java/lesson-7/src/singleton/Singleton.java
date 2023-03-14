package singleton;

// 单例模式
public class Singleton {
    // 私有化静态化唯一的实例对象
    // 私有化保护属性
    // 静态化只有加载一次属性
    private static Singleton singleton = new Singleton();

    // 私有化构造函数，避免开发者通过构造函数创建对象
    private Singleton() {}

    // 提供一个方法获取唯一实例
    public static Singleton getSingleton() {
        return singleton;
    }
}
