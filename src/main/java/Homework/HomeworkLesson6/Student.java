package Homework.HomeworkLesson6;

public class Student {

  int idNumber; // атрибут класса Student: номер студенческого билета
  String name; // атрибут класса Student: имя студента
  String surname; // атрибут класса Student: фамилия студента
  int course; // атрибут класса Student: год обучения
  double mathAverage; // атрибут класса Student: средняя оценка по математике
  double economicAverage; // атрибут класса Student: средняя оценка по экономике
  double foreignLanguageAverage; // атрибут класса Student: средняя оценка по иностранному языку

  Student(int idNumber1, String name1, String surname1, int course1,
          double mathAverage1, double economicAverage1, double foreignLanguageAverage1) {
    idNumber = idNumber1;
    name = name1;
    surname = surname1;
    course = course1;
    mathAverage = mathAverage1;
    economicAverage = economicAverage1;
    foreignLanguageAverage = foreignLanguageAverage1;
  }

  Student(int idNumber2, String name2, String surname2, int course2) {
    this(idNumber2, name2, surname2, course2, 0.0,0.0,0.0);
  }

  Student () {

  }

}

class StudentTest {

  double sredArifmOcenka(Student st) {
    double srednyaOcenka = ((st.mathAverage + st.economicAverage + st.foreignLanguageAverage) / 3);
    System.out.println("Средняя арифметическая оценка студента: " + st.name + " " + st.surname + " курса " +
            st.course + " = " + srednyaOcenka);
    return srednyaOcenka;

  }

  public static void main(String[] args) {
    Student first = new Student(1,"Ivan", "Ivanov", 3,
            3.5,4.1,4.5);

    Student second = new Student(31,"Kate", "Jonson",1);
    second.mathAverage = 3.4;
    second.economicAverage = 4.5;
    second.foreignLanguageAverage = 3.9;

    Student third = new Student();
    third.idNumber = 3;
    third.name = "Ilya";
    third.surname = "Malyshev";
    third.course = 4;
    third.mathAverage = 4.5;
    third.economicAverage = 4.8;
    third.foreignLanguageAverage = 4.1;

    StudentTest sTest = new StudentTest();
    sTest.sredArifmOcenka(first);
    sTest.sredArifmOcenka(second);
    sTest.sredArifmOcenka(third);


  }
}
