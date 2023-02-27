/**
 * 封装一个可以代替数组的类
 * 功能：
 * - 添加元素
 * - 获取元素
 * - 删除元素
 * - 修改元素
 * - 计算元素数量
 * - 没有长度限制
 * - 遍历
 */
public class ArrayBox<E> { // 泛型
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array; // 数组
    private int size = 0; // 数组实际长度

    private void rangeCheck(int index) {
        if (index < 0 || index + 1 > size) {
            // index范围超过了数组实际长度
            throw new BoxIndexOutOfBoundsException("index:" + index + ",size:" + size);
        }
    }

    // 将旧数组的元素挪到一个新数组中
    private Object[] copyOf(Object[] oldArray, int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    // 扩容数组
    private void grow(int minCapacity) {
        // 在当前数组长度的基础上，扩容1.5倍
        int oldCapacity = array.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity < minCapacity) {
            // 如果扩容后的数组长度还比数组实际需要的长度小，则直接使用minCapacity
            newCapacity = minCapacity;
        }
        // 将旧数组的内容挪到新数组中
        array = this.copyOf(array, newCapacity);
    }

    // 判断数组实际需要的长度是否比数组初始化的长度要大
    private void ensureCapacityInternal(int minCapacity) {
        // 如果数组实际需要的长度是否比数组初始化的长度要大，则将数组扩容
        if (minCapacity > array.length) {
            this.grow(minCapacity);
        }
    }

    public int size() {
        return size;
    }

    // 添加元素
    public boolean add(E item) {
        // 确保当前数组长度能够添加新元素
        this.ensureCapacityInternal(size + 1);
        array[size++] = item;
        return true;
    }
    // 获取元素
    public E get(int index) {
        // 检查index范围是否合法
        this.rangeCheck(index);
        return (E)array[index];
    }
    // 删除元素
    public E delete(int index) {
        // 检查index范围是否合法
        this.rangeCheck(index);
        E oldValue = (E)array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        return oldValue;
    }

    public ArrayBox() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public ArrayBox(int capacity) {
        array = new Object[capacity];
    }
}
