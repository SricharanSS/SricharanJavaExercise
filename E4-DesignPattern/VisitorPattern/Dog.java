package VisitorPattern;

public class Dog implements Animal{
    Dog dog;
    String name;
    Dog(String str) {
        this.name = str;
    }

    @Override
    public void setObj(Animal dog) {
        this.dog = (Dog)dog;
    }

    @Override
    public void accept(AnimalVisitor animalVisitor){
        animalVisitor.visit(dog);
    }
}
