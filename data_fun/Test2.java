package fr.learn_java.data_fun;

public class Test2 {
    public static void main(String[] args){
        MyList list1 = new MyList(5);
        list1.setValueAtIndex(17, 1);
        list1.setValueAtIndex(3, 0);
        System.out.println(list1.getValueAtIndex(1));
    }
}
