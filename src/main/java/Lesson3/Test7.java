package Lesson3;
/*
  Short circuit операции - прекращают свое действие, когда заранее известен результат всего выражения
  для && - если хотя бы одно выражение равно false - то все остальные оперции в выражении не выполняются
  для || - если хотя бы одно выражение равно true - то все остальные оперции в выражении не выполняются

  Если мы хотим, чтобы выполнялось все выражение в не зависимости от конечного результата, то стоит использовать
  betwice операторы (& и |) - по смыслу аналогичные && и ||, но только при выражение будет пройдено полностью

  Так же операторы (& и |) могут работать и с числовыми типами данных:
  так если операторы (&& и ||) нельзя использовать для вывод чисел, например 5 && 10, но
  (& и |) можно - будет выведено число в 2-й системе счисления:
  int a = 10; b = 5; (в 2-й системе 10 - это 1010, а 5 - это 0101 при использовании оператора & будет происходить
  сравение по каждому элементу числа по правилам & - где 0 - false, а 1 - true - результат 0,
  при использовании оператора | тоже самое - в результате получится 1111 - что в переводе в 10-ю систему = 15)

  Оператор ^ (beTwiceExclusiveOr) - возвращает true тогда и только тогда, когда одна операнда всего выражения true,
  во всех отстальных случаях вернет false
*/

public class Test7 {
  public static void main(String[] args) {

  int a = 10;
  int b = 5;
  boolean c = !(a > b);

  int x = 10;
  int y = 5;

  boolean b1 = true;
  boolean b2 = false;
  boolean b3 = false;
  boolean b4 = false;

    System.out.println(b1^b2^b3^b4);


  }
}
