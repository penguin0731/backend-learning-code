package util;


public class Test {
    public static void main(String[] args) {
        LinkBox lb = new LinkBox();
        for(int i = 0; i < 5; i++) {
            lb.add(i);
        }

        System.out.println(lb.getSize());
        System.out.println(lb.get(2));
        int removeItem = lb.remove(0);
        System.out.println(removeItem);
    }
}
