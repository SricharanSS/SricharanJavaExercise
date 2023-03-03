package BridgePattern;

public class Circle extends Shape{
    
    Circle(Draw draw) {
        super(draw);
    }

    @Override
    public void render() {
        draw.drawShape();
    }
}
