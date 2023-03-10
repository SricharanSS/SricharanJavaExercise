package Memento;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.set(10);
        sample.PrintNum();

        sample.saveSate();

        sample.set(20);
        sample.PrintNum();

        sample.undoState();
        sample.PrintNum();
    }
}
