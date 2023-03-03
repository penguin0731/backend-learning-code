package contains;

public class Car {
    public String brand; // 汽车品牌
    public String type; // 型号
    public String color; // 颜色
    public Wheel wheel; // 车里面有一个轮子 --> 包含关系（聚合）

    public void showCar() {
        System.out.println("这是一辆" + brand + "牌" + type + "型号的" + color + "小汽车");
        System.out.println("车上搭载了" + wheel.brand + "牌" + wheel.size + "尺寸的" + wheel.color + "轮胎");
        wheel.turn();
    }
}
