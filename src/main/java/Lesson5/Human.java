package Lesson5;
/*

*/
  public class Human {
    
    String name;
    Car3 car;
    BankAccount bA;

    void info() {
      System.out.println("Имя: " + name + " цвет машины: " + car.color + " баланс: " + bA.balance);
    }

}

  class HumanTest {

    public static void main(String[] args) {
      Human h = new Human();
      h.name = "David";
      h.car = new Car3("red", "V8");
      h.bA = new BankAccount(18, 200.5);
      h.info();

    }

  }


  class Car3 {

    Car3(String color, String engine) {

    this.color = color;
    this.engine = engine;
  }

    String color;
    String engine;

}

  class BankAccount {

    BankAccount(int id, double balance) {

      this.id = id;
      this.balance = balance;
    }

    int id;
    double balance;
}


