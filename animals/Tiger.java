package fr.learn_java.animals;

public class Tiger extends Felin{
    public Tiger(){

    }
    public Tiger(String color, int weight){
        this.color = color;
        this.weight = weight;
    }
    void shout(){
        System.out.println("I growls");
    }
}
