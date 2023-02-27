public class Person2 {
    public String name;
    public int age;

    public Person2() {
        System.out.println("无参数列表的构造函数执行了");
    }

    public Person2(String name, int age) {
        this();
        System.out.println("有参数列表的构造函数执行了");
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("程序块执行了");
    }
}
