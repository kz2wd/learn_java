package fr.learn_java.binary_tree;

public class MyBinaryTree {

    protected MyNode rootNode;
    protected MyNode actualNode;

    public MyBinaryTree(){}

    public MyBinaryTree(int rootValue){
        rootNode = new MyNode(rootValue);
        actualNode = rootNode;
    }

    public void addValue(int value){

        while (actualNode.getValue() != value) {

            if (value < actualNode.getValue()) {
                if (actualNode.getLeftNode() == null){
                    actualNode.setLeftNode(new MyNode(value));
                }
                actualNode = actualNode.getLeftNode();

            }
            else {
                if (actualNode.getRightNode() == null){
                    actualNode.setRightNode(new MyNode(value));
                }
                actualNode = actualNode.getRightNode();
            }
        }
        actualNode = rootNode;
    }

    public void display(){
        displayNodes(rootNode);
    }

    protected void displayNodes(MyNode Node){
        if (Node != null) {

                if (Node.getLeftNode() != null){
                    displayNodes(Node.getLeftNode());
                }

                System.out.println(Node.getValue());

                if (Node.getRightNode() != null){
                    displayNodes(Node.getRightNode());
                }
            }
        }


    public boolean isIn(int value){
        while (actualNode.getValue() != value) {

            if (value < actualNode.getValue()) {
                if (actualNode.getLeftNode() != null){
                    actualNode = actualNode.getLeftNode();
                }

                else {
                    actualNode = rootNode;
                    return false;
                }
            }

            else {
                if (actualNode.getRightNode() != null) {
                    actualNode = actualNode.getRightNode();
                }

                else {
                    actualNode = rootNode;
                    return false;
                }
            }
        }
        actualNode = rootNode;
        return true;
    }

    public void remove(int value){
        MyNode motherNode;
        motherNode = actualNode;

        if (isIn(value)) {
            if (rootNode.getValue() != value) {  // if the value is in the tree and it is not the root

                if (motherNode.getLeftNode() != null) {  // if there is a left child

                    if (value == motherNode.getLeftNode().getValue()) {  // if the deleted node is on the left of the mother node

                        if (actualNode.getLeftNode() != null) {  // if the deleted node has a left child node
                            motherNode.setLeftNode(actualNode.getLeftNode());  // we replace the node with the value to delete by her left child

                            if (actualNode.getRightNode() != null) {  // if the deleted node has also a right child node

                                // we want to append that to the 'last' right child of the deleted node

                                MyNode lastChild;  // we create 2 values to find this last right child
                                MyNode previousNode;

                                lastChild = actualNode.getLeftNode();
                                previousNode = actualNode;

                                while (lastChild != null) {
                                    previousNode = lastChild;
                                    lastChild = previousNode.getRightNode();
                                }
                                // lastChild will always be null so we use previousNode to get the previous node

                                previousNode.setRightNode(actualNode.getRightNode());  // so we append the right child of the deleted node to the last right child

                            }
                        } else if (actualNode.getRightNode() != null) {  // if there is no left child but there is a right child
                            motherNode.setLeftNode(actualNode.getRightNode());
                        }
                    }
                }


                if (motherNode.getRightNode() != null) {  // if there is a right child
                    // if the deleted node is on the right of the mother node
                    if (value == motherNode.getRightNode().getValue()) { // we do the same as before but on the right child of the mother node

                        if (actualNode.getLeftNode() != null) {  // if the deleted node has a left child node
                            motherNode.setRightNode(actualNode.getLeftNode());  // we replace the node with the value to delete by her left child

                            if (actualNode.getRightNode() != null) {  // if the deleted node has also a right child node

                                // we want to append that to the 'last' right child of the deleted node

                                MyNode lastChild;  // we create 2 values to find this last right child
                                MyNode previousNode;

                                lastChild = actualNode.getLeftNode();
                                previousNode = actualNode;

                                while (lastChild != null) {
                                    previousNode = lastChild;
                                    lastChild = previousNode.getRightNode();
                                }
                                // lastChild will always be null so we use previousNode to get the previous node

                                previousNode.setRightNode(actualNode.getRightNode());  // so we append the right child of the deleted node to the last right child

                            }
                        } else if (actualNode.getRightNode() != null) {  // if there is no left child but there is a right child
                            motherNode.setRightNode(actualNode.getRightNode());
                        }
                    }
                }
            }
            actualNode = rootNode;
        }
    }


}


