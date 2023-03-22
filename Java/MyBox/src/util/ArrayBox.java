package util;

public class ArrayBox implements Box{

    // 默认的数组长度
    private static final int DEFAULT_CAPACITY = 10;
    // 用来存放元素
    private int[] elementArr;
    //用来记录数组存储的有效元素个数
    private int size;

    public ArrayBox() {
        elementArr = new int[DEFAULT_CAPACITY];
    }
    public ArrayBox(int capacity) {
        elementArr = new int[capacity];
    }

    // 确保数组容量
    private void ensureCapacityInternal(int minCapacity) {
        // 如果数组长度不够
        if (minCapacity > elementArr.length) {
            grow(minCapacity);
        }
    }

    // 数组扩容
    private void grow(int minCapacity) {
        // 获得旧数组的长度
        int oldCapacity = elementArr.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        elementArr = copyOf(newCapacity);
    }

    // 将原数组迁移到新数组中
    private int[] copyOf(int newCapacity) {
        int[] newArray = new int[]{newCapacity};
        int oldCapacity = elementArr.length;
        for (int i = 0; i < oldCapacity; i++) {
            newArray[i] = elementArr[i];
        }
        return newArray;
    }

    // 检测index索引是否合法
    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            // 自定义异常
            throw new BoxIndexOutOfBoundsException("index:" + index + ",size:" + size);
        }
    }

    // 添加元素，返回值是否存储成功
    public boolean add(int element) {
        ensureCapacityInternal(size + 1);
        elementArr[size++] = element;
        return true;
    }

    // 通过索引获取元素
    public int get(int index) {
        rangeCheck(index);
        return elementArr[index];
    }

    // 通过删除元素，并将删除的元素返回
    public int remove(int index) {
        rangeCheck(index);
        int oldValue = elementArr[index];
        for (int i = index; i < size - 1; i++) {
            elementArr[index] = elementArr[index + 1];
        }
        elementArr[--size] = 0;
        return oldValue;
    }

    // 获取数组长度
    public int getSize() {
        return size;
    }
}
