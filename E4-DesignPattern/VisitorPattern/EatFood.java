package VisitorPattern;

public class EatFood implements AnimalVisitor {
    
    @Override
    public void visit(Dog dog) {
        System.out.println(dog.name+" wants bone!");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println(cat.name+" wants milk!");
    }
}
