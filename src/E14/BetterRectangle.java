package E14;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x,int y,int height,int width){
//        super.setLocation(x,y);
//        super.setSize(width, height);
        super(x,y,width,height);
    }
    public double getArea() {
        double area = super.getHeight() * super.getWidth();
        return area;
    }
    public double getPerimeter() {
        return 2 * (getHeight() + getWidth());
    }
}
