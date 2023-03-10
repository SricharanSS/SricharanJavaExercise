package BridgePattern;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Color red = new Red();

        circle.Draw(red);
    }
}
