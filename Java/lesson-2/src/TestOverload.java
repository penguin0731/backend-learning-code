public class TestOverload {
    public void test() {
        System.out.println("");
    }

    public void test(boolean b) {
        System.out.println("执行了test方法，参数类型为boolean，实参为" + b);
    }

    public void test(int i) {
        System.out.println("执行了test方法，参数类型为int，实参为" + i);
    }

    public void test(String s) {
        System.out.println("执行了test方法，参数类型为String，实参为" + s);
    }

    public void test(int...x) {
        for(int i:x) {
            System.out.println("执行了test方法，携带动态列表" + i);
        }
    }

    public static void main(String[] args) {
        TestOverload to = new TestOverload();
        to.test();
        to.test(true); // 执行了test方法，参数类型为boolean，实参为true
        to.test('a'); // 执行了test方法，参数类型为int，实参为97
        to.test("a"); // 执行了test方法，参数类型为String，实参为a
        to.test(1,2,3);
        // 执行了test方法，携带动态列表1
        // 执行了test方法，携带动态列表2
        // 执行了test方法，携带动态列表3
    }
}