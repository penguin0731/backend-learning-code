package util;

public class LinkBox implements Box{

    private Node first; // 首节点
    private Node last; // 尾节点
    private int size; // 链表的有效个数

    // 将元素添加到新的Node里并挂在链表尾端
    private void linkLast(int element) {
        // 获取链表的尾端
        Node l = last;
        // 创建一个新节点
        Node newNode = new Node(l, element, null);
        // 将新节点对象设置为尾节点
        last = newNode;
        if (size == 0) {
            // 如果链表本身为空，那么需要设置首节点
            first = newNode;
        } else {
            // 如果链表不为空，那么原来的尾节点的尾节点也需要更新
            l.setNext(newNode);
        }
        size++;
    }

    // 检查索引是否合法
    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new BoxIndexOutOfBoundsException("index:" + index + ", size:" + size);
        }
    }

    // 根据索引找到Node对象
    private Node getNode(int index) {
        Node targetNode;
        // 判断索引是在前半部分还是后半部分
        if (index < (size >> 1)) {
            targetNode = first;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.getNext();
            }
        } else {
            targetNode = last;
            for (int i = size - 1; i > index; i--) {
                targetNode = targetNode.getPrev();
            }
        }

        return targetNode;
    }

    private Node removeNode(int index) {
        Node targetNode = getNode(index);
        Node prevNode = targetNode.getPrev();
        Node nextNode = targetNode.getNext();

        if (nextNode == null) {
            // 目标节点是最后一个节点
            last = prevNode;
        } else {
            nextNode.setPrev(prevNode);
            targetNode.setNext(null);
        }

        if (prevNode == null) {
            // 目标节点是第一个节点
            first = nextNode;
        } else {
            prevNode.setNext(nextNode);
            targetNode.setPrev(null);
        }

        size--;

        return targetNode;
    }

    @Override
    public boolean add(int element) {
        linkLast(element);
        return true;
    }

    @Override
    public int get(int index) {
        rangeCheck(index);
        Node targetNode = getNode(index);
        return targetNode.getNode();
    }

    @Override
    public int remove(int index) {
        rangeCheck(index);
        Node targetNode = removeNode(index);
        return targetNode.getNode();
    }

    @Override
    public int getSize() {
        return size;
    }
}
