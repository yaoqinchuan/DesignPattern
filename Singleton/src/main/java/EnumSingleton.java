public enum EnumSingleton {
    INSTANCE;
    private String target = "HELLO";

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getInstance() {
        return target;
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.setTarget("hello");

        String EnumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        System.out.println(EnumSingleton2);
    }
}
// 使用枚举，可以对抗java的反射对之前单例模式的破坏，是最好的方案
