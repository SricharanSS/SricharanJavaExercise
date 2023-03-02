package VisitorPattern;

public class MakeSound implements AnimalVisitor{
    
    @Override
    public void visit(Dog dog) {
        System.out.println(dog.name+" bark....");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println(cat.name+" meow....");
    }
}
