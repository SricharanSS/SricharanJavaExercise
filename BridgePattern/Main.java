package BridgePattern;

import NotBridgePattern.BlueCircle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedCircle());

        circle.render();
    }
}
