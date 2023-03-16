package class_load;

public class Person extends Animal{

    public static String testStaticField = "testStaticField";
    public String testField = "testFiled";

    public Person() {
        System.out.println("我是Person的无参构造函数");
    }

    static {
        Person.test_static();
        System.out.println("我是Person的静态程序块" + testStaticField);
    }

    {
        System.out.println("我是Person的普通程序块" + testField);
    }

    static void test_static() {
        System.out.println("我是Person的静态方法");
    }

    public void test() {
        System.out.println("我是Person的实例方法");
    }

}
