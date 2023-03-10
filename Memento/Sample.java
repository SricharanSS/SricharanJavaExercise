package Memento;

public class Sample {
    private int num;
    CareTaker careTaker = new CareTaker();
    public void set(int num) {
        this.num = num;
    }

    public void PrintNum() {
        System.out.println("Number = "+num);
    }

    public void saveSate() {
        careTaker.addMemento(new Memento(num));
    }

    public void undoState() {
        Memento previousState = careTaker.getMemento();
        num = previousState.returnBackUp();
    }
}
