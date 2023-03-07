package packA;

public class TestA {
    public void testPublic() {
        System.out.println("TestA的public方法");
    }
    protected void testProtected() {
        System.out.println("TestA的protected方法");
    }
    void testDefault() {
        System.out.println("TestA的默认不写方法");
    }
    private void testPrivate() {
        System.out.println("TestA的private方法");
    }

    public static void main(String[] args) {
        TestA ta = new TestA();
        ta.testPublic();
        ta.testProtected();
        ta.testDefault();
        ta.testPrivate();
    }
}
