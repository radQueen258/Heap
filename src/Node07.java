public class Node07 {

    private int key;
    private Node07 left;
    private Node07 right;
    private Node07 parent;


    public Node07(){}

    public Node07(int key, Node07 left, Node07 right) {
        this.key = key;
        this.left = left;
        this.right = right;
        //this.parent = parent;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node07 getLeft() {
        return left;
    }

    public void setLeft(Node07 left) {
        this.left = left;
    }

    public Node07 getRight() {
        return right;
    }

    public void setRight(Node07 right) {
        this.right = right;
    }

    public Node07 getParent() {
        return parent;
    }

    public void setParent(Node07 parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Node : " + getKey();
    }

}
