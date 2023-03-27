package polymorphism;

public class Cat extends Animal{
    public String name = "cat的name属性";

    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    @Override
    void work() {
        System.out.println("抓老鼠");
    }
}
