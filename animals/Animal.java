package fr.learn_java.animals;

abstract class Animal {
    protected int weight;
    protected String color;

    protected void eat(){
        System.out.println("I eat meat");
    }

    protected void drink(){
        System.out.println("I drink water");
    }

    abstract void move();

    abstract void shout();

    public String toString(){
        return "I am and object of " + this.getClass() + ", i am " + this.color + ", my weight is " + this.weight;
    }



}
