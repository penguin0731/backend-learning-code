package packA.innerpackA;

import packA.TestA;

public class InnerTestA extends TestA {
    public static void main(String[] args) {
        InnerTestA ita = new InnerTestA();
        ita.testPublic();
        ita.testProtected();
    }
}
