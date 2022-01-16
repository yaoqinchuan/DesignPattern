

public class BaseObject implements Cloneable{
    Integer data;

    String attribute;

    public BaseObject() {
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BaseObject{" +
                "data=" + data +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}
