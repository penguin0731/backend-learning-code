package class_load;

public class Animal {

    public static String testStaticField = "testStaticField";
    public String testField = "testFiled";

    public Animal() {
        System.out.println("我是Animal的无参构造函数");
    }

    static {
        Animal.test_static();
        System.out.println("我是Animal的静态程序块" + testStaticField);
    }

    {
        System.out.println("我是Animal的普通程序块" + testField);
    }

    static void test_static() {
        System.out.println("我是Animal的静态方法");
    }

    public void test() {
        System.out.println("我是Animal的实例方法");
    }

}
