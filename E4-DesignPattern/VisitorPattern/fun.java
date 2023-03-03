package VisitorPattern;

public class fun implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Cat Fun");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Dog fun");
    }
}
