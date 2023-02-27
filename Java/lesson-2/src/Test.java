public class Test {
    public static void main(String[] args) {
//        // 在这里使用Person类
//        Person p = new Person(); // 创建一个Person类的对象p
//        // 给对象的属性赋值
//        p.name = "Tom";
//        p.age = 10;
//        p.sex = "男";
//        System.out.println(p.name + "年龄是" + p.age + "，性别是" + p.sex);
//        p.eatRice();
//        p.sayMyName();
//        p.eat("面条");
//        String drink = p.buyDrink(10);
//        System.out.println("买了" + drink);
//=====================================================================
//        Func f = new Func();
//        int[] arr = {1, 9, 4, 6, 7, 5};
//        f.sort(arr, true);
//        System.out.println(arr);
//        f.sort(arr, false);
//        System.out.println(arr);
//======================================================================
//        TestOverload to = new TestOverload();
//        to.test();
//        to.test(true);
//        to.test('a');
//        to.test(1,2,3,4);
//=======================================================================
        Person2 p2 = new Person2("Tom", 18);
        System.out.println(p2.name + "的年龄是" + p2.age);
    }
}
