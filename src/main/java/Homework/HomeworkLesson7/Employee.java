package Homework.HomeworkLesson7;

public class Employee {

  int id; // доступно только внутри пакета
  public String surname; // доступно везде
  int age;
  private double salary; // доступно только внутри класса
  String department;

  Employee(int id, String surname, int age, double salary, String department) {
    this.id = id;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
    this.department = department;
  }

  public Employee(int id) {
    this.id = id;
  }

  Employee(String surname) {
    this.surname = surname;
  }

  private Employee(double salary) {
    this.salary = salary;
  }

  double yvelichenieZP () {
    System.out.println("Зарплата до повышения: " + salary);
    salary *= 2;
    System.out.println("Зарплата после повышения: " + salary);
    System.out.println();
    return salary;
  }

  public void getId() {
    System.out.println("Id = " + id);
  }

  public void getSurname() {
    System.out.println("Surname = " + surname);
  }

  public void getSalary() {
    System.out.println("Salary = " + salary);
  }

}

class EmployeeTest {

  public static void main(String[] args) {

    Employee emp1 = new Employee(1234);
    Employee emp2 = new Employee("Ivanov");

    System.out.println(emp1.id);
    System.out.println(emp1.surname);
    System.out.println(emp1.age);

    System.out.println();

    System.out.println(emp2.id);
    System.out.println(emp2.surname);
    System.out.println(emp2.age);

    System.out.println();

    emp1.getId();
    emp1.getSalary();
    emp1.getSurname();

    System.out.println();

    emp2.getId();
    emp2.getSalary();
    emp2.getSurname();



  }
}
