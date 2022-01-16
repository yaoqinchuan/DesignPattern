public class Girl extends Changer{
    public Girl(Morrigan m) {
        super(m);
    }

    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((Original) super.m).setMessage("变身少女");
    }
}
