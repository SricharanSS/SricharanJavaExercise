package VisitorPattern;

public interface Animal {
    void setObj(Animal animal);
    void accept(AnimalVisitor animalVisitor);
}
