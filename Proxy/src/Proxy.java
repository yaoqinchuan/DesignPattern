public class Proxy  implements Specialty{

    private Specialty specialty;

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }


    @Override
    public void display() {
        System.out.println("中间商代理一下");
        specialty.display();
        System.out.println("中间商代理结束");
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.setSpecialty(new AnhuiSpecialty());
        proxy.display();
    }
}
/*
当无法或不想直接引用某个对象或访问某个对象存在困难时，可以通过代理对象来间接访问。使用代理模式主要有两个目的：一是保护目标对象，二是增强目标对象。

前面分析了代理模式的结构与特点，现在来分析以下的应用场景。
远程代理，这种方式通常是为了隐藏目标对象存在于不同地址空间的事实，方便客户端访问。例如，用户申请某些网盘空间时，会在用户的文件系统中建立一个虚拟的硬盘，用户访问虚拟硬盘时实际访问的是网盘空间。
虚拟代理，这种方式通常用于要创建的目标对象开销很大时。例如，下载一幅很大的图像需要很长时间，因某种计算比较复杂而短时间无法完成，这时可以先用小比例的虚拟代理替换真实的对象，消除用户对服务器慢的感觉。
安全代理，这种方式通常用于控制不同种类客户对真实对象的访问权限。
智能指引，主要用于调用目标对象时，代理附加一些额外的处理功能。例如，增加计算真实对象的引用次数的功能，这样当该对象没有被引用时，就可以自动释放它。
延迟加载，指为了提高系统的性能，延迟对目标的加载。例如，Hibernate 中就存在属性的延迟加载和关联表的延时加载。

在前面介绍的代理模式中，代理类中包含了对真实主题的引用，这种方式存在两个缺点。
真实主题与代理主题一一对应，增加真实主题也要增加代理。
设计代理以前真实主题必须事先存在，不太灵活。采用动态代理模式可以解决以上问题，如 SpringAOP，其结构图如图 4 所示。
 */
