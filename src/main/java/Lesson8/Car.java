package Lesson8;

/*
final для reference типа данных:
Если reference переменная final, то мы не можем изменить адрес данной переменной

мы можем поменять свойства самого объекта, но не создать новый объект (то есть ссылку на новый объект)

*/

public class Car {

  String color = "blue";
  String engine = "V6";

}

class Human {

  String name = "Ilya";
  final Car c = new Car();

  public static void main(String[] args) {

    Human h1 = new Human();
    h1.c.engine = "V3";
    h1.c.color = "red";
    System.out.println("vladelec " + h1.name + " cvet " + h1.c.engine + " motor " + h1.c.engine);


    /* h1.c = new Car(); нельзя создать новый объект класса Car, в данном классе, так как reference переменная c
    (класса Human) - static, но можно менять свойства самого объекта
    */

  }

}
