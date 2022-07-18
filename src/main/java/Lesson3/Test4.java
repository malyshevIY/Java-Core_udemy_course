package Lesson3;

/*
Арифмитические операторы: +, -, *, /, %, ++, --
 При делении 2-х целочисленных переменных дробная часть отсекается
 % - оператор остатка от деления (как целых так и дробных чисел)
 Унарные операции: ++ (к какому-то значению прибавляется 1) и -- (от какого-то значению убавляется 1),
 при этом, если унарные операции используются в выражении, то они работают следующим образом:
 если унарный оператор стоит перед переменной (префикс), то значение переменной увеличивается/уменьшается на 1.
 если унарный оператор стоит после переменной (постфикс), то значение переменной увеличивается/уменьшается на 1, но в
 самом выражении используется предыдущее значение переменной. Если есть выражение, в котором используется несколько унарных
 операторов, как префиксов, так и постфиксов - то их работа остается прежней - если префикс увеличиваем/уменьшаем сразу,
 если постфикс используем предыдущее значение переменной (если ранее был постфикс, то переменная уже увеличена или уменьшена, не забываем
 про этот нюанс)
*/

public class Test4 {
  public static void main(String[] args) {

    double a = 5.5;
    double b = 3.5;
    double c = a % b;

    int x = 5;
    int y = 3;
    int z = x - y++; // выведет 3, так ккк постфикс ++ увеличит значение переменной y на 1 только после выполнения
    // вычетания. Если ++ будет стоять впереди y (префикс), то от х будет вычетаться y уже увеличенный на 1


    System.out.println(z);

  }
}
