package sLab;

import java.lang.Math;

public abstract class Circle {

   private int radius;

   public Circle(int radius) {
       super(Circle);
       this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
       return radius*Math.PI*2;
    }
}
