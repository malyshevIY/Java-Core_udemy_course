package Lesson4;
/*
При наличии в одном файле нескольких классов с методом main, при запуске класса, будут обрабатываться только те методы,
которые входят в данный конкретный класс. (Все что между {} того класса, который мы запускаем), после чего программа прекратит
работу, запуск других классов, входящих в файл, не произойдет.
Аналогично, если мы запустим любой другой класс из этого файла.
Если запускать выполнение java-кода не через IDE, а например через блокнот, то в таком случае первым бы запустился класс,
который имеет название public class.

Если ни в одном классе нет метода main, то мы не сможем запустить ни один класс (то-же самое, если у нас один класс).
Данный код - not executable, т.е не выполним. Классы являются executable, только тогда, когда у них есть метод main.
*/

public class Test20 {
  public static void main(String[] args) {
    System.out.println("Welcome to the 4-th lesson");
  }
}

class Test21 {
  public static void main(String[] args) {
    System.out.println("Welcome!!!");
  }
}
