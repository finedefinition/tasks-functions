package objects;

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple a = new Apple();
        new Hedgehog().eat(a);
    }

    public static class Apple {
    }
}
