package BridgePattern;

import javax.swing.AbstractAction;

public abstract class Shape {
    Draw draw;
    Shape(Draw draw) {
        this.draw = draw;
    }

    abstract void render();
}
