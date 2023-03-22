package interfaceTest;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        p.sleep();
        p.growUp(9);
        System.out.println("I am " + p.getAge() + " years old now.");
    }
}
