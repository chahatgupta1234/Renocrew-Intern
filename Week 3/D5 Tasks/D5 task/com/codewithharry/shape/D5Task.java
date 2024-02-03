// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

/*
*** WRITE THIS CODE IN NOTEPAD ***
 You have to create a package named com.codewithharry.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheritance to properly manage the code!
 Include methods like volume, surface area and getters/setters for dimensions
 */

//  package com.codewithharry.shape;
 class Recatangle{
  int length;
  int breadth;
   public int getLength(){
     return length;
   }
   public void setLength(int length){
     this.length = length;
   }
   public int getBreadth(){
     return breadth;
   }
   public void setBreadth(int breadth){
     this.breadth = breadth;
   }
   public int area(){
     return length * breadth;
   }
   public int perimeter(){
     return 2 * (length + breadth);
   }
 }
 
 class Square extends Recatangle{
   public int area(){
     return length * length;
   }
   public int perimeter(){
     return 4 * length;
   }
 }
 
 class Circle{
    int radius;
   public int getRadius(){
     return radius;
   }
   public void setRadius(int radius){
     this.radius = radius;
   }
   public double area(){
     return Math.PI * radius * radius;
   }
   public double perimeter(){
     return 2 * Math.PI * radius;
   }
 }
 
 class Cylinder extends Circle{
    int height;
   public int getHeight(){
     return height;
   }
   public void setHeight(int height){
     this.height = height;
   
 }
   public double volume(){
     return area() * height;
   }
   public double surfaceArea(){
     return 2 * area() + 2 * perimeter() * height;
   }
 }
 
 class sphere extends Circle
   {
     public double volume(){
       return (4/3) * Math.PI * radius * radius * radius;
     }
     public double surfaceArea(){
       return 4 * Math.PI * radius * radius;
     }
   }
 
 
 public class D5Task {
   public static void main(String[] args) {
     System.out.println("Hello world!");
   }
 
 }