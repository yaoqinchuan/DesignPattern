public class StarvingSingleton {

    private String name;

    private static final StarvingSingleton starvingSingleton = new StarvingSingleton();

    /* 使用静态代码块其实也一样
     private static final StarvingSingleton starvingSingleton;
     static {
        starvingSingleton = new StarvingSingleton();
     }
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 防止其他类创建该对象
    private StarvingSingleton() {
    }

    // 对外方法获取单例
    public static StarvingSingleton getInstance() {
        return starvingSingleton;
    }

    public static void main(String[] args) {
        StarvingSingleton starvingSingleton1 = StarvingSingleton.getInstance();
        starvingSingleton1.setName("hello");

        StarvingSingleton starvingSingleton2 = StarvingSingleton.getInstance();
        System.out.println(starvingSingleton2.name);
    }

}
// 饿汉模式，在初始化的时候就创建出来了，会造成大量的内存浪费，但是不会存在并发的问题