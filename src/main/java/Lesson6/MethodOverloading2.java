package Lesson6;
/*
  Rules of Overloading

Return type может быть одинаковый и различный;
Access modifier может быть одинаковым или различный;
Методы отличающиеся только Return type и Access modifier не являются Overloaded - Compile Error;

*/
public class MethodOverloading2 {

  // Метод возвращает сложенный int
  int sum(int i1, int i2) {
    return i1 + i2;
  }

  // Метод возвращает конкатенацию String
  String sum(String s1, String s2) {
    return s1 + s2;
  }
}

class Overloading2Test {

  public static void main(String[] args) {

    MethodOverloading2 mO2 = new MethodOverloading2();
    int  a = mO2.sum(5,7);
    System.out.println(a);
    String s = mO2.sum("Privet ","kak dela ?");
    System.out.println(s);
  }
}


