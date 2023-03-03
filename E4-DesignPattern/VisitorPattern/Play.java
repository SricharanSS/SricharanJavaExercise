package VisitorPattern;

public class Play implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Dogs PLays....");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Cat PLay....");
    }
}
