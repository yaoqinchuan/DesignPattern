public class LazySingleton {

    private String name;

    /* volatile 保证在对象初始化的时候出现指令重排序因为A线程在进行对象创建的时候分为三个步骤:
     1、对象空间创建
     2、赋值给变量
     3、对象空间初始化
     这是非原子的，当A线程位于步骤2的时候，因为指令重排，线程B可以拿到地址，但是没有初始化完成，这可能出现问题
    */
    private volatile static LazySingleton lazySingleton;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 防止其他类创建该对象
    private LazySingleton() {
    }
    // 对外方法获取单例
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public static void main(String[] args) {
        LazySingleton starvingSingleton1 = LazySingleton.getInstance();
        starvingSingleton1.setName("hello");

        LazySingleton starvingSingleton2 = LazySingleton.getInstance();
        System.out.println(starvingSingleton2.name);
    }
}
