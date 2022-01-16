
//具体构件角色：原身
public class Original implements Morrigan{

    String message = "莫莉卡·安斯兰 原始状态";

    public Original() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void display() {
        System.out.println(message);
    }
}
