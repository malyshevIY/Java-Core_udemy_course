package Lesson7;
/*
Контроллер доступа (access modifier)
- public - виден в любом пакете;
- private - будет виден только внутри этого класса;
- default - существует всегда, когда access modifier не пишется (когда access modifier дефолтный, то этот элемент
будет виден только внутри своего пакета);
- protected
*/
public class Employee {

  public double salary;

  public void dvoinayaZP() {
    System.out.println("Novaya ZP = " + salary * 2);
  }

    public Employee(double salary2) {
      salary = salary2;
    }

  public static void main(String[] args) {

    Employee emp = new Employee(21500);
    System.out.println("Staraya Zp = " + emp.salary);
    emp.dvoinayaZP();

  }

}

class EmployeeTest {

  public static void main(String[] args) {
    Employee emp = new Employee(21500);
    System.out.println("Staraya Zp = " + emp.salary);
    emp.dvoinayaZP();

  }


}
