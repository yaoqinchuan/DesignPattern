// 简单工厂通过构造时传入的标识来生产产品，不同产品都在同一个工厂中生产，这种判断会随着产品的增加而增加，给扩展和维护带来麻烦

public class SimpleFactory {

        public SimpleFactory() {
        }

        public static IProduct getProduct(int prodNo)
        {
            // 根据产品标识生产产品
            switch (prodNo)
            {
                case 1:
                    return new ProductA();
                case 2:
                    return new ProductB();
                default:
                    return new ProductC();
            }
        }


    // 产品A
    static class ProductA implements IProduct
    {
        @Override
        public void printProductName() {
            System.out.println("product A");
        }
    }

    //产品B
    static class ProductB implements IProduct
    {

        @Override
        public void printProductName() {
            System.out.println("product B");
        }
    }

    //产品C
    static class ProductC implements IProduct
    {

        @Override
        public void printProductName() {
            System.out.println("product C");
        }
    }

    //产品接口
    public interface IProduct
    {
        void printProductName();
    }

    public static void main(String[] args) {
        IProduct productA = SimpleFactory.getProduct(1);
        productA.printProductName();
        IProduct productB = SimpleFactory.getProduct(2);
        productB.printProductName();
    }
}
// 简单工厂的问题就在于swich case（或者if else)。每当新增一种产品时，你都需要去维护工厂中的判断语句，造成该工厂类不断增长，各种判断挤在一起，给扩展和维护带来麻烦。
// 产品和工厂没有实现完全解耦，绑定在一起