public class StaticLazySingleton {
    private String name;

    private StaticLazySingleton() {
    }
    /*
    SingletonHolder 是一个静态内部类，当外部类 StaticLazySingleton 被加载的时候，
    并不会创建 SingletonHolder 实例对象。只有当调用 getInstance() 方法时，
    SingletonHolder 才会被加载，这个时候才会创建 instance。
    instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载。
     */
    private static class SingletonHolder {
        public static final StaticLazySingleton staticLazySingleton = new StaticLazySingleton();
    }
    
    private static StaticLazySingleton getInstance() {
        return SingletonHolder.staticLazySingleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        StaticLazySingleton StaticLazySingleton1 = StaticLazySingleton.getInstance();
        StaticLazySingleton1.setName("hello");

        StaticLazySingleton StaticLazySingleton2 = StaticLazySingleton.getInstance();
        System.out.println(StaticLazySingleton2.getName());
    }
}
