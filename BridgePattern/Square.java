package BridgePattern;

public class Square extends Shape{
    String shape = "Square";

    /**
     * 
     */
    @Override
    public void Draw(Color color) {
        System.out.println("Shape : "+this.shape);
        System.out.println("Color : "+color.returnColor());
    }
}
