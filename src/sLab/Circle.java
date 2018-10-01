package sLab;

import java.lang.Math;

public abstract class Circle extend Shape {

   private int radius;
   public Circle(int radius) {
       super("Circle");
       this.radius = radius;
    }
    public double getArea() {
        double y = this.radius*this.radius*Math.PI;
        return y;
    }
    public double getPerimeter() {
        double v = this.radius * Math.PI * 2;
        return v;
    }
}
