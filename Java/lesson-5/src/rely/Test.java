package rely;

public class Test {
    public static void main(String[] args) {
        Oil o = new Oil(10);
        Motor motor = new Motor(1);
        motor.calcRunTime(o);
    }
}
