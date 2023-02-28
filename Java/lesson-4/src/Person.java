public class Person extends Animal{

    public Person() {
        System.out.println("Person的无参构造函数");
    }

    public void eat() {
        super.eat();
        System.out.println("Person吃饭");
    }

    public void study() {
        System.out.println("学习");
    }
}
