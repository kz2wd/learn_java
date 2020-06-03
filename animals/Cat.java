package fr.learn_java.animals;

public class Cat extends Felin {
    public Cat(){

    }
    public Cat(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    void shout(){
        System.out.println("I meow");
    }
}
