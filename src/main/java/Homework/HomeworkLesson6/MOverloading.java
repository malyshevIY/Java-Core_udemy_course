package Homework.HomeworkLesson6;

public class MOverloading {

  int sum() {
    int result = 0;
    System.out.println("Сумма всех чисел: " + result);
    return result;
  }

  int sum(int a) {
    int result1 = a;
    System.out.println("Сумма всех чисел: " + result1);
    return result1;
  }

  int sum(int a, int b) {
    int result2 = a + b;
    System.out.println("Сумма всех чисел: " + result2);
    return result2;
  }

  int sum (int a, int b, int c) {
    int result3 = a + b + c;
    System.out.println("Сумма всех чисел: " + result3);
    return result3;
  }

  int sum(int a, int b, int c, int d) {
    int result4 = a + b + c + d;
    System.out.println("Сумма всех чисел: " + result4);
    return result4;
  }

}

class MOverloadingTest {

  public static void main(String[] args) {

    MOverloading mO = new MOverloading();
    mO.sum();
    mO.sum(5);
    mO.sum(10,15);
    mO.sum(20,30,40);
    mO.sum(50,60,70,80);
  }
}
