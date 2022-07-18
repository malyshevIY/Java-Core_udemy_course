package Lesson6;
/*
  Constructor Overload

  Перегруженные конструкторы имеют разный список параметров:
  - разный по типам данных;
  - разный по количеству;
  - разный по порядку;

  Rules of Overloading for Constructor

  - Access modifier может быть одинаковым или различный;
  - Конструкторы, отличающиеся только Return type и Access modifier не являются Overloaded - Compile Error;

 !!! Существует такое правило: Конструктор не может вызывать внутри себя (то есть внутри своего тела) его Overloaded
  конструктор по имени класса - Compile Error; !!!

 !!! Мы можем использовать ключевое слово "this" на первой строке в теле для вызова Overloaded конструктора внутри
  конструктора !!!


*/

public class Employee {

  int id;
  String surname;
  int age;
  double salary;
  String department;

  Employee(int id2, String surname2, int age2) {
  this(id2,surname2,age2,0.0,null);
  }

  public Employee(String surname3, int age3) {
  this(0,surname3,age3,0.0,null);
  }

  Employee(int id4, String surname4, int age4, double salary4, String department4) {
  id = id4;
  surname = surname4;
  age = age4;
  salary = salary4;
  department = department4;
  }


}

class EmployeeTest {

  public static void main(String[] args) {

    Employee emp1 = new Employee(1, "Ivanov", 25);
    System.out.println(emp1.id);

    Employee emp2 = new Employee("Petrov",30);
    System.out.println(emp2.surname);

    Employee emp3 = new Employee(2,"Sidorov",35,355000, "IT");
    System.out.println(emp3.department);

  }
}