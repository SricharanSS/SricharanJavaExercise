package Memento;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> history = new ArrayList<>();

    void addMemento(Memento memento) {
        history.add(memento);
    }

    Memento getMemento() {
        return history.get(history.size()-1);
    }
}
