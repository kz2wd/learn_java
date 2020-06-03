package fr.learn_java.binary_tree;

public class Test3 {
    public static void main(String[] args){

        MyBinaryTree mbt = new MyBinaryTree(3);

        mbt.addValue(10);
        mbt.addValue(15);
        mbt.addValue(20);
        mbt.addValue(12);
        mbt.addValue(11);
        mbt.display();
        System.out.println("removing");

        mbt.remove(10);

        mbt.display();

    }
}
