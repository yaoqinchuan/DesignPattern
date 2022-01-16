public class PrototypeObject implements Cloneable{

    private BaseObject baseObject;

    private String name;

    public PrototypeObject() {
    }

    public BaseObject getBaseObject() {
        return baseObject;
    }

    public void setBaseObject(BaseObject baseObject) {
        this.baseObject = baseObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeObject prototypeObject = new PrototypeObject();
        prototypeObject.baseObject = (BaseObject) this.baseObject.clone();
        return prototypeObject;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeObject prototypeObject1 = new PrototypeObject();
        BaseObject baseObject = new BaseObject();
        baseObject.setAttribute("base attribute.");
        baseObject.setData(1);

        prototypeObject1.setBaseObject(baseObject);
        prototypeObject1.setName("hello");

        PrototypeObject prototypeObject2 = (PrototypeObject)prototypeObject1.clone();

        System.out.println("prototypeObject1 equals prototypeObject2 ?" + (prototypeObject2 == prototypeObject1 ? "true":"false"));
        System.out.println("prototypeObject1's base equals prototypeObject2's base ?" + (prototypeObject2 == prototypeObject1 ? "true":"false"));
    }

}
// 原形模式主要是通过clone实现深拷贝的过程，也可以通过序列化来实现