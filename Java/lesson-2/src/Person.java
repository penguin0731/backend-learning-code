public class Person {
    // 属性 静态
    // 属性必要的组成部分
    // 修饰符 数据类型 属性名 [= 值]
    public String name; // 全局变量 字符型 属性名为name
    public int age;
    public String sex;

    // 方法
    // 修饰符 [特征修饰符] 返回值类型 方法名(参数列表) [抛出异常] [{ 方法体 }]
    public void eatRice() {
        System.out.println("吃了一碗米饭");
    }
    public String sayMyName() {
        return this.name;
    }
    public void eat(String food) {
        System.out.println("吃了" + food);
    }
    public String buyDrink(int money) {
        return money > 5 ? "红牛" : "矿泉水";
    }
}
