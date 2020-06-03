package fr.learn_java.animals;

public class Dog extends Canin implements FriendlyDog {
    public Dog(){

    }

    public Dog(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    void shout(){
        System.out.println("I bark without reason");
    }

    public void hug(){
        System.out.println("I hug you");
    }
    public void lap(){
        System.out.println("I lap");
    }
    public void proud(){
        System.out.println("I am a good boi");
    }

}
