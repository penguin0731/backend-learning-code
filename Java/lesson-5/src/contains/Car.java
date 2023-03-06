package contains;

public class Car {
    private String brand; // 汽车品牌
    private String color; // 颜色
    private Wheel wheel; // 汽车和轮胎 --> 聚合关系

    public Car(String brand, String color, Wheel wheel) {
        this.brand = brand;
        this.color = color;
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void printCarInfo() {
        System.out.println("This is a " + color + " " + brand + " car with " + wheel.getColor() + " " + wheel.getBrand() + " wheel.");
    }
}
