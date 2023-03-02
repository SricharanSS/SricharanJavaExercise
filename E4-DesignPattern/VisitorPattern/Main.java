package VisitorPattern;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Spike");
        Animal cat = new Cat("Tom");

        dog.setObj(dog);
        cat.setObj(cat);

        cat.accept(new MakeSound());
        cat.accept(new EatFood());
        dog.accept(new MakeSound());
        dog.accept(new EatFood());

    }
}
