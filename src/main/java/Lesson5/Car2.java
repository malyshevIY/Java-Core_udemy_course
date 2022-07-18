package Lesson5;
/*

 */

public class Car2 {
  // класс Car2 состоит из 3-х переменных и 3-х методов
  String color;
  String engine;
  int speed;

  // Метод qaz увеличивает и показывает скорость машины
  int qaz(int scorost) {
    speed += scorost;
    return speed;
  }

  // Метод tormoz уменьшает и показывает скорость машины
  int tormoz(int scorost) {
    speed -= scorost;
    return speed;
  }

  // Метод showInfo выдает информацию о том, какая машина (цвет, мотор и с какой скоростью она сейчас едет). В данном
  // случае на не нужно, чтобы метод имел output, поэтому вместо возвращаемого типа данных мы используем тип метода void.
  // void в переводе с англ. - пустота
  void showInfo() {
    System.out.println("cvet: " + color + " motor: " + engine + " skorost: " + speed);

  }
}

class Car2Test {

  public static void main(String[] args) {

    // Создаем объект класса Car2 с именем c1
    Car2 c1 = new Car2();
    c1.color = "green";
    c1.engine = "V6";
    c1.speed = 100;

    // Вызываем методы класса Car2 для объекта c1
    c1.showInfo();
    c1.qaz(50);
    c1.showInfo();
    c1.tormoz(150);
    c1.showInfo();


  }

}
