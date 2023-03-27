package polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        System.out.println(a1.name);
        System.out.println(a2.name);

        a1.eat();
        a1.work();

        a2.eat();
        a2.work();

        Cat c = (Cat) a1;
        Dog d = (Dog) a2;
        System.out.println(c.name);
        System.out.println(d.name);
    }
}
