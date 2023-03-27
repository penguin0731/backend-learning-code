package polymorphism;

public class Dog extends Animal{
    public String name = "dog的name属性";

    @Override
    void eat() {
        System.out.println("吃骨头");
    }

    @Override
    void work() {
        System.out.println("看家");
    }
}
