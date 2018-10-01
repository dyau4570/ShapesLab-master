package sLab;

import java.lang.Math;

public abstract class Circle extend Shape {

   private int radius;

   public Circle(int radius) {
       super("Circle");
       this.radius = radius;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter() {
       return this.radius*Math.PI*2;
    }
}
