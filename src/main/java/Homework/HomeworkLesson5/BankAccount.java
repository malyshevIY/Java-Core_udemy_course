package Homework.HomeworkLesson5;
/*

 */


public class BankAccount {

  // создаем instance (экземпляр) variables (переменные)
  int id;
  String name;
  double balance;

  // Метод пополнения счета
  void popolnenieScheta(double suma) {
    System.out.println("Сумма на счете: " + balance);
    System.out.println("Счет пополнен на сумму: " + suma);
    balance += suma;
    System.out.println("Сумма на счете после пополнения: " + balance);
    System.out.println();
  }

  // Метода снятия со счета
  void snyatieSoScheta(double suma) {
    System.out.println("Сумма на счете: " + balance);
    System.out.println("Снятие со счета на сумму: " + suma);
    balance -= suma;
    System.out.println("Сумма на счете после снятия: " + balance);
    System.out.println();
  }
}

  class BankAccountTest {
  public static void main(String[] args) {

    BankAccount myAccount = new BankAccount(); // Создан объект класса BankAccount с именем myAccount
    myAccount.id = 1; // присвоили объекту myAccount значение id
    myAccount.name = "Ilya"; // присвоили объекту myAccount значение name
    myAccount.balance = 12.35; // присвоили объекту myAccount значение balance
    myAccount.popolnenieScheta(109.99);
    myAccount.snyatieSoScheta(51.25);
  }
}

