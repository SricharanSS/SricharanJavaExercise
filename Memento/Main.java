package Memento;

public class Main {
    public static void main(String[] args) {
        Sample obj = new Sample(10);
        Memento backUp = obj.saveSate();

        obj.set(20);
        System.out.println(obj.returnValue());
    }
}
