package contains;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Tom");
        p.sayMyEyes();
        Wheel w = new Wheel("Michelin", "white");
        Car c = new Car("benz", "black", w);
        // 人和汽车 --> 关联关系
        System.out.println(p.getName() + " is driving the " + c.getBrand() + " car.");
        c.printCarInfo();

    }
}
