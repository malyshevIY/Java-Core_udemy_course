package Homework.HomeworkLesson5;

public class Employee {

  int id;
  String surname;
  int age;
  double salary;
  String department;

  Employee(int id, String surname, int age, double salary, String department) {
    this.id = id;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
    this.department = department;
  }

  double yvelichenieZP () {
    System.out.println("Зарплата до повышения: " + salary);
    salary *= 2;
    System.out.println("Зарплата после повышения: " + salary);
    System.out.println();
    return salary;

  }
}

class EmployeeTest {

  public static void main(String[] args) {

    Employee em1 = new Employee(1,"Malyshev",29, 92000.50, "QA");
    Employee em2 = new Employee(2,"Ivanov", 31,200500.34,"DD");

    em1.yvelichenieZP();
    em2.yvelichenieZP();


  }
}
