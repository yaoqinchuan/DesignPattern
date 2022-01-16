public class Factory {

    // 工厂接口
    interface IFactory {
        IProduct getProduct();
    }

    // A工厂类
    static class FactoryA implements IFactory {
        IProduct productA;

        public FactoryA() {
            this.productA = new ProductA();
        }

        @Override
        public IProduct getProduct() {
            return this.productA;
        }
    }

    //B工厂类
    static class FactoryB implements IFactory {
        IProduct productB;

        public FactoryB() {
            this.productB = new ProductB();
        }

        @Override
        public IProduct getProduct() {
            return this.productB;
        }
    }

    static class ProductA implements IProduct {
        @Override
        public void printProductName() {
            System.out.println("product A");
        }
    }

    //产品B
    static class ProductB implements IProduct {

        @Override
        public void printProductName() {
            System.out.println("product B");
        }
    }

    //产品C
    static class ProductC implements IProduct {

        @Override
        public void printProductName() {
            System.out.println("product C");
        }
    }

    //产品接口
    public interface IProduct {
        void printProductName();
    }

    public static void main(String[] args) {
        IProduct productA = new FactoryA().getProduct();
        productA.printProductName();
        IProduct productB = new FactoryB().getProduct();
        productB.printProductName();
    }
}
// 工厂只负责生产产品，而产品实现自己的功能；
// 在工厂模式中，已经将工厂类分开，不再将所有产品在同一工厂中生产，解决了简单工厂中不断增加的switch case的问题。
// 如再新增一个C产品，那么只需写一个C工厂和C产品，在调用时用C工厂生产C产品即可，A和B工厂和产品完全不受影响