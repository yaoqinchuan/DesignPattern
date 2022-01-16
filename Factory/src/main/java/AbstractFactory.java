// 工厂模式中，一个工厂生产一个产品，所有产品派生于同一个抽象产品（或产品接口）；
// 而抽象工厂模式中，一个工厂生产多个产品，它们是一个产品族，不同的产品族的产品派生于不同的抽象产品（或产品接口）
public class AbstractFactory {

    // 工厂接口，即抽象工厂
    interface IFactory {
        IFridge CreateFridge();

        IAirCondition CreateAirCondition();
    }

    // 三星的工厂，生产三星的产品族
    static class SamsungFactory implements IFactory {
        public IAirCondition CreateAirCondition() {
            // 三星的工厂生产三星的空调
            return new SamsungAirCondition();
        }

        public IFridge CreateFridge() {
            // 三星的工厂生产三星的冰箱
            return new SamsungFridge();
        }
    }

    // 格力的工厂，生产格力的产品族
    static class GreenFactory implements IFactory {
        public IAirCondition CreateAirCondition() {
            // 格力的工厂生产格力的空调
            return new GreenAirCondition();
        }

        public IFridge CreateFridge() {
            // 格力的工厂生产格力的冰箱
            return new GreenFridge();
        }
    }

    // 冰箱产品接口
    interface IFridge {
        void printFridgeName();
    }

    // 空调接口
    interface IAirCondition {
        void printAirConditionName();
    }

    // 三星的冰箱
    public static class SamsungFridge implements IFridge {
        @Override
        public void printFridgeName() {
            System.out.println("samsung fridge");
        }
    }

    // 格力的冰箱
    public static class GreenFridge implements IFridge {
        @Override
        public void printFridgeName() {
            System.out.println("green fridge");
        }
    }

    // 三星的空调
    public static class SamsungAirCondition implements IAirCondition {
        @Override
        public void printAirConditionName() {
            System.out.println("samsung air condition.");
        }

    }

    // 格力的空调
    public static class GreenAirCondition implements IAirCondition {
        @Override
        public void printAirConditionName() {
            System.out.println("green air condition.");
        }
    }

    public static void main(String[] args) {
        IAirCondition samsungAirCondition = new SamsungFactory().CreateAirCondition();
        samsungAirCondition.printAirConditionName();
    }
}
// 在工厂模式中，一个工厂生产一个产品，所有的具体产品是由同一个抽象产品派生的，不存在产品等级结构和产品族的概念；
// 而在抽象工厂中，同一个等级的产品是派生于一个抽象产品（即产品接口），一个抽象工厂派生不同的具体工厂，每个具体工厂生产自己的产品族（包含不同产品等级）
// 三种工厂的实现是越来越复杂的
// 简单工厂通过构造时传入的标识来生产产品，不同产品都在同一个工厂中生产，这种判断会随着产品的增加而增加，给扩展和维护带来麻烦
// 工厂模式无法解决产品族和产品等级结构的问题
// 抽象工厂模式中，一个工厂生产多个产品，它们是一个产品族，不同的产品族的产品派生于不同的抽象产品（或产品接口）