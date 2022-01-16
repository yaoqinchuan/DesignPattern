public class ConcreteBuilder extends Builder{

    @Override
    public void buildPartA() {
        System.out.println("建造A");
    }

    @Override
    public void buildPartB() {
        System.out.println("建造B");
    }

    @Override
    public void buildPartC() {
        System.out.println("建造C");
    }
}
