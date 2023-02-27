public class Test {
    public static void main(String[] args) {
        ArrayBox<Integer> arrayBox = new ArrayBox<Integer>(5);
        for (int i = 1; i <= 5; i++) {
            arrayBox.add(10 * i);
        }
//        System.out.println(arrayBox.size());
//        System.out.println(arrayBox.array.length);
//        System.out.println(arrayBox.get(5));

        int deleteItem = arrayBox.delete(0);
        System.out.println("删除的是" + deleteItem);
        System.out.println("size是" + arrayBox.size());
        for(int i = 0; i < arrayBox.size(); i ++) {
            System.out.println(arrayBox.get(i));
        }

    }
}
