package Lesson7;

/*
Основные цели package
- Зашита доступа (access protection);
- Управление набором возможных имен (namespace management);
- Хранение связанных классов в одном месте (Keeping related classes in one place)
*/

import Lesson6.Employee;

public class A {

  public static void main(String[] args) {

    B object = new B(); // создаем объект класса B, находящийся в одном пакете с классом A;
    Lesson6.Employee emp = new Employee("Ivanov", 21); // Создаем объект класса Employee, находящийся в другом пакете (Lesson6);

  }
}
