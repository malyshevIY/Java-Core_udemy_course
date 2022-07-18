package Lesson5;

/*
  Constructor
 Основная цель конструктора - это создание объекта. Примеры:
 Car car1 = new Car();
 BankAccount bA = new BankAccount();
 String name = new String("Petr");

!!! Конструктор всегда называется также как и класс:
name of constructor = name of class

  Типы конструктора:
  1) Default (дефолтный конструктор) - компилятор самостоятельно его создает, поэтому мы его можем не прописывать.
   например: Car() {}
  - создается компилятором;
  - Всегда без параметров;
  - Тело всегда пустое;
  2) User defined - то есть тот конструктор, который мы сами в ручную определяем. Правило - если мы определили в классе
  какой-либо конструктор, то компилятор уже не будет создавать дефолтный конструктор.
  - Создается нами;
  - Может быть с параметрами и без;
  - Тело может быть пустым или нет;

  Отличие методов от конструктора:
  - метод всегда имеет return type (если ничего не нужно возвращать ставим void)
  - конструктор не имеет return type
  - название методов безгранично
  - название конструктора ограничено названием его класса

*/
public class NewCar {

  NewCar(String cvet, String motor) {
    color = cvet;
    engine = motor;
  }

  String color;
  String engine;

}

class CarTest{

  public static void main(String[] args) {
    NewCar car1 = new NewCar("Yellow", "V4");
    System.out.println("цвет автомобиля: " + car1.color + " разновидность мотора: " + car1.engine);
  }

}
