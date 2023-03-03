package Memento;

public class Sample {
    private int num;
    Sample(int num) {
        this.num = num;
    }

    public void set(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public Memento saveSate() {
        return new Memento(num);
    }

    public int returnValue() {
        return num;
    }
}
