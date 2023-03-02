package VisitorPattern;

public interface AnimalVisitor {
    void visit(Dog dog);
    void visit(Cat cat);
}
