class Employee {
    int salary;
    String name;
  
    public int getSalary() {
      return salary;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String n) {
      name = n;
    }
  }
  
  class CellPhone {
    public void ring() {
      System.out.println("Ringing...");
    }
  
    public void vibrate() {
      System.out.println("Vibrating...");
    }
  
    public void callFriend() {
      System.out.println("Calling Mukul...");
    }
  
  }
  
  class Square {
    int side;
  
    public int area() {
      return side * side;
    }
  
    public int perimeter() {
      return 4 * side;
    }
  }
  
  class Tommy {
    public void hit() {
      System.out.println("Hitting the enemy");
    }
  
    public void run() {
      System.out.println("Running from the enemy");
    }
  
    public void fire() {
      System.out.println("Firing on the enemy");
    }
  }
  
  class Rectangle {
    int l, b;
  
    public int area() {
      return l * b;
    }
  
    public int perimeter() {
      return 2 * (l + b);
    }
  }
  
  class Circle {
    int r;
  
    public double area() {
      return Math.PI * r * r;
    }
  
    public double perimeter() {
      return 2 * Math.PI * r;
    }
  }
  
  public class p1 {
    public static void main(String[] args) {
      /*
       * // Problem 1
       * Employee harry = new Employee();
       * harry.setName("CodeWithHarry");
       * harry.salary = 233;
       * System.out.println(harry.getSalary());
       * System.out.println(harry.getName());
       * 
       * // Problem 2
       * CellPhone asus = new CellPhone();
       * asus.callFriend();
       * asus.vibrate();
       * //asus.ring();
       * 
       * 
       * // Problem 3
       * Square sq = new Square();
       * sq.side = 3;
       * System.out.println(sq.area());
       * System.out.println(sq.perimeter());
       */
  
      // problem 4
      Rectangle obj = new Rectangle();
      obj.l = 3;
      obj.b = 2;
      System.out.println("Area of rec " + obj.area());
      System.out.println("Perimeter of rec " +
          obj.perimeter());
  
      // Problem 5
      Tommy player1 = new Tommy();
      player1.fire();
      player1.run();
      player1.hit();
  
      // problem 6
      Circle r = new Circle();
      r.r = 3;
      System.out.println("Area of circle " + r.area());
      System.out.println("Perimeter of circle " +
          r.perimeter());
  
    }
  }