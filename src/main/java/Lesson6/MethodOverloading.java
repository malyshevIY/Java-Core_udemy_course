package Lesson6;
/*
  Overloading Method - перегрузка - имеют одинаковые имена и разный список параметров.
  Разный список параметров:
  - разный по типам данных;
  - разный по количеству;
  -

  Компилятор самостоятельно определяет какой метод нужно вызывать:
   - по названию метода;
   - типу данных параметра, который стоит внутри метода;
   - разный по порядку; (у одного int, boolean у другого boolean, int)

   java не позволяет создавать методы с одинаковыми именами и с одинаковыми параметрами

*/

public class MethodOverloading {

  // Метод выводящий на экран переменную с типом данных int
  void show(int i1) {
    System.out.println(i1);
    System.out.println("Data type is int");
  }

  // Метод выводящий переменную с типом данных boolean
  void show(boolean b1) {
    System.out.println(b1);
    System.out.println("Data type is boolean");
  }

  // Метод выводящий переменную с типом данных String
  void show(String s1) {
    System.out.println(s1);
    System.out.println("Data type is String");
  }

  // Метод выводящий переменную с типом String и переменную с типом int
  void show(String s, int a) {
    System.out.println("String: " + s + "int: " + a);
  }

  // Метод выводящий переменную с типом String, но имеющий другой порядок параметров (см. метод выше)
  void show(int a, String s) {
    System.out.println("Какой хороший день !!!");
  }
}

class OverloadingTest {

  public static void main(String[] args) {

    MethodOverloading mO = new MethodOverloading();
    int a = 500;
    boolean b = true;
    String s = "Privet !!!";
    mO.show(a);
    mO.show(b);
    mO.show(s);
    mO.show("privet",10);
    mO.show(10,"privet");

  }

}
