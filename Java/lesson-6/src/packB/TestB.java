package packB;

import packA.TestA;

public class TestB extends TestA{
    public static void main(String[] args) {
        TestB tb = new TestB();
        tb.testPublic();
        tb.testProtected();
    }
}
