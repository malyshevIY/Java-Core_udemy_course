package Lesson5;
/*
  Method

  Метод обрабатывает какие-либо переменные (input) и возвращает какое-то значение (output).
  То есть это функция или операция.

  Структура метода: На примере public static void main(String[] args) {}

  - не обязательные элементы:
  1) Access modifier - public
  2) Non-access modifier - static
  3) Parameter(s) - то, что заключено в круглых скобках
  - обязательные элементы:
  3) Return type - (int, double, void и тп.) - то, что возвращает метод (его output). Тип данных который имеет output
  нашего метода.
  4) Имя метода (main)
  5) () - обязательный элемент
  6) body - тело метода в {}

  Типы Return type:
  void - пустота, когда нам не нужно, чтобы метод имел output

*/

 public class Test20 {

   // Создание метода сложения 3-я чисел
   int sum(int a, int b, int c) { // задаем параметры int a, int b, int c методу
     int result = a + b + c;
     return result; // возвращаем значение (output), равное сумме int a, int b, int c
   }

   //Метод определения среднего арифметического трех чисел (пример использования метода внутри метода)
   int srednyaArifm(int a1, int b1, int c1) {
     int result2 = sum(a1,b1,c1)/3;
     return result2;
   }

 }

 class Test21 {
   public static void main(String[] args) {
    // Вызов метода
     Test20 t = new Test20(); // создаем объект класса Test20
     int summaTrexChisel = t.sum(5,10,15); // Создаем переменную типа int и присваиваем ей значение со ссылкой
     // на объект t вызывающий метод sum, в котором мы параметрам подставляем нужные нам значения. После этой манипуляции
     // метод sum вызываемый объектом t класса Test20 будет хранить в себе уже не параметры, а АРГУМЕНТЫ с конкретными
     // значениями

     System.out.println(summaTrexChisel);
     System.out.println(t.sum(1,2,3));
     System.out.println(t.srednyaArifm(20,40,60));


   }

 }
