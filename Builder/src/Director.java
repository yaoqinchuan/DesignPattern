public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(Product product) {
        builder.setProduct(product);
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }

    public static void main(String[] args) {
        Product product = new Product();
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct(product);
    }
}
/*
建造者模式唯一区别于工厂模式的是针对复杂对象的创建。也就是说，如果创建简单对象，通常都是使用工厂模式进行创建，而如果创建复杂对象，就可以考虑使用建造者模式。
当需要创建的产品具备复杂创建过程时，可以抽取出共性创建过程，然后交由具体实现类自定义创建流程，使得同样的创建行为可以生产出不同的产品，分离了创建与表示，使创建产品的灵活性大大增加。

建造者模式主要适用于以下应用场景：
相同的方法，不同的执行顺序，产生不同的结果。
多个部件或零件，都可以装配到一个对象中，但是产生的结果又不相同。
产品类非常复杂，或者产品类中不同的调用顺序产生不同的作用。
初始化一个对象特别复杂，参数多，而且很多参数都具有默认值。*/