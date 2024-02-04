
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2 * Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }


}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4*Math.PI * radius* radius;
          
    }
    public double volume(){
        return (4* Math.PI* radius * radius * radius)/3;
    }


}

public class Main {

    public static void main(String[] args) {
        /*
        // Problem 1
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */


        // Problem 3
        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        // problem 4
        Rectangle r2 = new Rectangle();
        System.out.println(r2.getLength());
        System.out.println(r2.getBreadth());

        // problem 5
        Sphere s = new Sphere(9);
        System.out.println("volume of sphere "+ s.volume());
        System.out.println("surface area of sphere is "+       
        s.surfaceArea());
        
    }
}
