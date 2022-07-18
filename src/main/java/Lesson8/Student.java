package Lesson8;
/*
  Если перед переменной стоит Non-access modifier static - это означает, что данная переменная принадлежит всему классу,
  и она является общей для всех созданных объектов т.е (class variable, а не object variable)
  
  static могут быть как переменные(variables), так и методы(methods) - главное их свойство, что они принадлежат не
  какому-то объекту, а всему классу в целом. Существуют и могут быть использованы без создания объекта класса.

  Для вызова переменной или метода, принадлежащей целому классу стоит вызывать данную переменную или метод ссылаясь на
  сам класс - к примеру - Student.count

  При этом static элементы: переменные и методы - не могут вызывать, обращаться к instance переменным и методам (только
  через созданный объект)

 */

public class Student {

  String name;
  int cource;
  static int count; // общая переменная для всех объектов, которые к ней обращаются (они могут изменять ее, но они
  // не хранят ее внутри себя. Если бы данная переменная была бы просто int count, то они хранили бы ее внутри себя,
  // и другие объекты не могли бы к ней обращаться, соответственно счетчик студентов, согласно этому коду, всегда был бы
  // равен 1)

  public Student (String name2, int cource2) {
    count++; // переменная будет увеличиваться на 1 при создании нового студента
    name = name2;
    cource = cource2;
    System.out.println("student # " + count + " create");
  }

  public static void showCount() {
    System.out.println("Vsego sozdano studentov " + count); // метод static - общий для всего класса
  }

}

class StudentTest {

  public static void main(String[] args) {

    Student st1 = new Student("Ivan", 1);
    Student st2 = new Student("Petr", 4);
    Student st3 = new Student("Masha", 2);
    System.out.println();

    System.out.println(Student.count); // вызов static переменной count - только через имя класса,
    // к которому она принадлежит
   Student.showCount(); // вызов static метода - только через имя класса,
    // к которому он принадлежит


  }
  
}
