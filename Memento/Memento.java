package Memento;

public class Memento {
    final int backup;
    Memento(int elementToBackUp) {
        this.backup = elementToBackUp;
    }

    public int returnBackUp() {
        return this.backup;
    }
}
