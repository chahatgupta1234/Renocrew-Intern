abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

abstract class Telephone
  {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
  }

class SmartPhone extends Telephone
  {
    public void ring()
    {
      System.out.println("Ringing...");
    }
    public void lift()
    {
      System.out.println("Lifting...");
    }
    public void disconnect()
    {
      System.out.println("Disconnecting...");
    }
  }

interface TVremote {
  int button = 15;
  void changeChannel();
}

interface smartTVremote extends TVremote
  {
    void changeChannel();
    void increaseVolume();
    void decreaseVolume();
  }

class TV implements TVremote{
  public void changeChannel()
  {
    System.out.println("Changing Channel...");
  }
}


  
public class practice {
    public static void main(String[] args) {
        // Q1
        FountainPen pen = new FountainPen();

        // Q2
        pen.changeNib();

        // Q3
        Human harry = new Human();
        harry.sleep();

        //Q4 
        SmartPhone s = new SmartPhone();
        s.ring();
        s.lift();
        s.disconnect();

        // Q5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();

        BasicAnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();

        // Q6 + Q7
        TV t = new TV();
        t.changeChannel();

    }
}
