package util;

public class Node {

    private Node prev;
    private int node;
    private Node next;

    public Node(Node prev, int node, Node next) {
        this.prev = prev;
        this.node = node;
        this.next = next;
    }

    public int getNode() {
        return node;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
