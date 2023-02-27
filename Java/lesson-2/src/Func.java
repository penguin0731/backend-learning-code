public class Func {
    public void sort(int[] array, boolean flag) {
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = array.length - 1; j > i; j--) {
                boolean aesc = flag && array[j] < array[j - 1];
                boolean desc = !flag && array[j] > array[j - 1];
                if (aesc || desc) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
