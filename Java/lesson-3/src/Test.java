public class Test {
    public static void main(String[] args) {
        ArrayBox arrayBox = new ArrayBox();
        for (int i = 0; i < 5; i++) {
            arrayBox.add(10 * i);
        }
        System.out.println(arrayBox.size);
        System.out.println(arrayBox.array.length);
        System.out.println(arrayBox.get(5));
    }
}
