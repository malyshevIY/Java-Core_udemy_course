package Homework.HomeworkLesson8;

public class Class1 {

  static double productOfNumber (double a, double b, double c) {
    return a * b * c;
  }
    static void divisionOfNumbers (int a, int b) {
      System.out.println("celoe chastnoe = " + a/b + " ostatok ot delenya  = " + a % b);
  }
}

  class Test {
  public static void main(String[] args) {

    System.out.println(Class1.productOfNumber(2,3,4));
    Class1.divisionOfNumbers(9,2);

    System.out.println(Class1.productOfNumber(2.5, 3.4, 4));
    Class1.divisionOfNumbers(15, 18);



  }

}
