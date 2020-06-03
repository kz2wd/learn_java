package fr.learn_java.animals;

public class Wolf extends Canin {

    public Wolf(){

    }

    public Wolf(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public void shout(){
        System.out.println("I howls to the moon");
    }
}
