package fr.learn_java.animals;

public class Test {
    public static void main(String[] args){
        Wolf w = new Wolf("Bleuège", 500);
        w.drink();
        w.eat();
        w.move();
        w.shout();
        System.out.println(w.toString());
    }
}
