package contains;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "奔驰";
        c.type = "x8";
        c.color = "黑色";
        c.wheel = new Wheel();
        c.wheel.brand = "米其林";
        c.wheel.size = 400;
        c.wheel.color = "银色";
        c.showCar();
    }
}
