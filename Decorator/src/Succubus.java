public class Succubus extends Changer{
    public Succubus(Morrigan m) {
        super(m);
    }
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((Original) super.m).setMessage("变身女妖");
    }
}
