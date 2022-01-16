// 抽象装饰角色：变形
public class Changer {

    Morrigan m;

    public Changer(Morrigan m) {
        this.m = m;
    }

    public void display() {
        m.display();
    }
}
