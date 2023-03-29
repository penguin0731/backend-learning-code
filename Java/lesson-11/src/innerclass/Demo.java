package innerclass;

public class Demo {
    private String name = "这是正常类中的属性";
    public void testDemo() {
        System.out.println("这是正常类中的方法");
    }
    public void testDemoPart() {
        String x = "外部类的方法中的变量";
        final String y = "外部类的方法中的final变量";
        x = "aaa";
        // 局部内部类，临时性存在
        class PartInnerDemo{
            private String name = "这是局部内部类的属性";
//            String xx = x;
            public void testPartInnerDemo() {
                System.out.println("这是局部内部类的方法: " + this.name);
                System.out.println(y);
            }
        }
        PartInnerDemo pID = new PartInnerDemo();
        pID.testPartInnerDemo();
    }

    // 成员内部类
    public class InnerDemo {
        private String name = "这是成员内部类的属性";
        public void testInnerDemo() {
            System.out.println("这是成员内部类的方法: " + this.name);
            Demo.this.testDemo();
            System.out.println("在成员内部类中访问外部类的私有属性: " + Demo.this.name);
        }
    }

    // 静态内部类
    public static class StaticInnerDemo {
        private String name = "这是静态内部类的属性";
        public void testStaticInnerDemo() {
            System.out.println("这是静态内部类的方法: " + name);
        }
    }
}
