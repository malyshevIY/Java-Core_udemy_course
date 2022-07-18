package Lesson8;

/*
  Non-access modifier (final, static)

  final Non-access modifier может быть у переменной(variable) - постоянная(constant), метода и класса.

  final variable должны быть инициализированы до их использования:
  - при определении переменной;
  - в каждом конструкторе, если переменная не static

  final variable (константа) - означает, что значение переменной меняться не может (находиться может в любом месте
  переменной, главное чтобы до типа переменной. Например: public final int a = 10; или final public int a = 10 -
  но принято указывать после access modifier)
  !!! у final variable переменной нет дефолтного значения. Поэтому при создании констант необходимо предавать им значения.

   stat ic

*/

public class Test1 {

  public final int a;

  Test1() {
    a = 10;
  }

  Test1(boolean b) {
    a = 15;
  }

  public void abc (short s) {
    final byte b = 10;
    System.out.println(s + b);
  }

  public static void main(String[] args) {

    Test1 t = new Test1();
    System.out.println(t.a);

  }

}
