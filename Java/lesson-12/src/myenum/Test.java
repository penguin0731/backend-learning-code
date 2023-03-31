package myenum;

public class Test {
    public static void main(String[] args) {
        Color c = Color.RED;
        System.out.println(c);

        for (Color myColor : Color.values()) {
            System.out.println(myColor);
        }
    }
}
