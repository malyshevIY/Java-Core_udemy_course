package Lesson3;
/*
  Последовательность обработки операторов, если они находятся в одном выражении (по приоритетам с 1 до 7):
  1. ++ -- !
  2. * / %
  3. + -
  4. < <= > >=
  5. == !=
  6. && ||
  7. = += -=  *= /= %=



*/

public class Test8 {
  public static void main(String[] args) {

    int a = 10;
    int b = 3;


    int c = ++a - b * 2; // a = 10 + 1 = 11 - 6 = 5
    int d = (++a - b) * 2; // (11 - 3) * 2 = 16
    int e = (a-- - b) * 2; // (10 - 3) * 2 = 14 - так как постфиск выполниться, но на само выражение не повлияет

    System.out.println(c);

    char char1 = 'a';
    int int1 = 10;

    System.out.println(int1 + char1); // в юникоде char соответствует порядоковому номеру его значения символ a соответствует
    // 97 поэтому можно проводить любые операции арифмитические операции

  }
}
