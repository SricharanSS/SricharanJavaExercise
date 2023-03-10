package BridgePattern;

public class Circle extends Shape{
    String shape = "Circle";
    /**
     *
     */
    @Override
    void Draw(Color color) {
        System.out.println("Shape : "+this.shape);
        System.out.println("Color : "+color.returnColor());
    }
}
