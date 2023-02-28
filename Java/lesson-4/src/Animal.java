public class Animal {
    public String name;

    public Animal() {
        System.out.println("Animal的无参构造函数");
    }

    public void eat() {
        System.out.println("Animal吃饭");
    }

    public void sleep() {
        this.eat();
        System.out.println("Animal睡觉");
    }

}
