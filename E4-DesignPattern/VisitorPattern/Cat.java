package VisitorPattern;

public class Cat implements Animal {
    Cat cat;
    String name;
    Cat(String str) {
        this.name = str; 
    }

    @Override
    public void setObj(Animal cat) {
        this.cat = (Cat)cat;
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(cat);
    }
}
