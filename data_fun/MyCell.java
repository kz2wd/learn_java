package fr.learn_java.data_fun;

public class MyCell {
    protected int value;
    protected MyCell nextCell;

    public MyCell(){
    }

    public int getValue(){
        return value;
    }

    public MyCell getNextCell(){
        return nextCell;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setNextCell(MyCell nextCell){
        this.nextCell = nextCell;
    }
}
