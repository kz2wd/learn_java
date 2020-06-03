package fr.learn_java.animals;

public class Lion extends Felin {
    public Lion(){

    }

    public Lion(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    void shout(){
        System.out.println("I rawr");
    }
}
