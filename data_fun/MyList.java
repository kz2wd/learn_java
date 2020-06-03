package fr.learn_java.data_fun;

public class MyList{

    protected MyCell firstCell;
    protected MyCell actualCell;
    protected MyCell nextCell;

    public MyList(int length){

        firstCell = new MyCell();
        actualCell = firstCell;

        for(int i = 0; i < length; i++){
            nextCell = new MyCell();
            actualCell.setNextCell(nextCell);
            actualCell = nextCell;

        }

        actualCell = firstCell;

    }

    public void setValueAtIndex(int value, int index) {
        for(int i = 0; i < index; i++){
            nextCell = actualCell.getNextCell();
            actualCell = nextCell;
        }
        actualCell = firstCell;

        actualCell.setValue(value);

    }

    public int getValueAtIndex(int index) {
        for(int i = 0; i < index; i++){
            nextCell = actualCell.getNextCell();
            actualCell = nextCell;
        }
        actualCell = firstCell;
        return actualCell.getValue();

    }

}
