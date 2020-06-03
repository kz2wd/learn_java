package fr.learn_java.binary_tree;

public class MyNode {

    protected int value;
    protected MyNode leftNode;
    protected MyNode rightNode;

    public MyNode(){}

    public MyNode(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public MyNode getLeftNode() {
        return leftNode;
    }

    public MyNode getRightNode() {
        return rightNode;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftNode(MyNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(MyNode rightNode) {
        this.rightNode = rightNode;
    }
}
