package Lesson4;
/*
  Object Creation
  Создание объекта BankAccount в классе BankAccount

  Любой класс является типом данных в java - reference (ссылочный тип данных)
  BankAccount(тип данных переменной) bA(имя переменной) = new BankAccount() (вызов конструктора - создание объекта);

  Difference between primitive and reference data type (Различие между примитивными и ссылочными типами данных)
  - примитивные типы данных содержат значение переменной, хранящиеся в конкретном месте в памяти;
  - ссылочный тип данных содержит ссылку(указатель) на объект, который хранит в себе какое-то значение,
   но не сам объект
  - примитивных типов данных - 8, а ссылочных - бесконечное множество

  default значения примитивных типов данных:
  byte = 0 short = 0 int = 0 long = 0

  float = 0.0 double = 0.0

  char = '\u0000' или 0
  boolean = false

  default значения reference типов данных: null
  Если в instance variables сразу задать значения, то все объекты созданные с данными переменными,
  изначально будут иметь эти значения

*/

public class BankAccount {

  // создаем instance (экземпляр) variables (переменные)
  int id;
  String name;
  double balance;


  public static void main(String[] args) {

    BankAccount myAccount = new BankAccount(); // Создан объект класса BankAccount с именем myAccount
    BankAccount yourAccount = new BankAccount(); // Создан объект класса BankAccount с именем yourAccount
    BankAccount hisAccount = new BankAccount(); // Создан объект класса BankAccount с именем hisAccount

    myAccount.id = 1; // присвоили объекту myAccount значение id
    myAccount.name = "Zaur"; // присвоили объекту myAccount значение name
    myAccount.balance = 12.35; // присвоили объекту myAccount значение balance

    yourAccount.id = 2; // присвоили объекту yourAccount значение id
    yourAccount.name = "Ilya"; // присвоили объекту yourAccount значение name
    yourAccount.balance = 77.77; // присвоили объекту yourAccount значение balance

    hisAccount.id = 3; // присвоили объекту hisAccount значение id
    hisAccount.name = "Mike"; // присвоили объекту hisAccount значение name
    hisAccount.balance = 251.03; // присвоили объекту hisAccount значение balance


    System.out.println(myAccount.balance); // выводим значение balance объекта myAccount
    System.out.println(hisAccount.name); // если не задать значение будут выводиться default значения типов данных

  }
}
