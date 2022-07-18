package Homework.HomeworkLesson4;

public class Student {

  int idNumber; // атрибут класса Student: номер студенческого билета
  String name; // атрибут класса Student: имя студента
  String lastName; // атрибут класса Student: фамилия студента
  int yearOfStudy; // атрибут класса Student: год обучения
  double mathAverage; // атрибут класса Student: средняя оценка по математике
  double economicAverage; // атрибут класса Student: средняя оценка по экономике
  double foreignLanguageAverage; // атрибут класса Student: средняя оценка по иностранному языку
  double arithmeticMeanScore; // атрибут класса Student: средняя арифметическая оценка
}

class StudentTest {

  public static void main(String[] args) {

    Student first = new Student();
    Student second = new Student();
    Student third = new Student();

    first.idNumber = 1;
    first.name = "Ivan";
    first.lastName = "Ivanov";
    first.yearOfStudy = 2012;
    first.mathAverage = 3.4;
    first.economicAverage = 4.0;
    first.foreignLanguageAverage = 4.7;
    first.arithmeticMeanScore = (first.mathAverage + first.economicAverage + first.foreignLanguageAverage) / 3;

    second.idNumber = 2;
    second.name = "Kate";
    second.lastName = "Johns";
    second.yearOfStudy = 2013;
    second.mathAverage = 4.8;
    second.economicAverage = 5.0;
    second.foreignLanguageAverage = 4.3;
    second.arithmeticMeanScore = (second.mathAverage + second.economicAverage + second.foreignLanguageAverage) / 3;

    third.idNumber = 3;
    third.name = "Ilya";
    third.lastName = "Malyshev";
    third.yearOfStudy = 2014;
    third.mathAverage = 4.5;
    third.economicAverage = 4.8;
    third.foreignLanguageAverage = 4.1;
    third.arithmeticMeanScore = (third.mathAverage + third.economicAverage + third.foreignLanguageAverage) / 3;

    System.out.println("Средняя оценка " + first.name + " " + first.lastName + " = " + first.arithmeticMeanScore);
    System.out.println("Средняя оценка " + second.name + " " + second.lastName + " = " + second.arithmeticMeanScore);
    System.out.println("Средняя оценка " + third.name + " " + third.lastName + " = " + third.arithmeticMeanScore);
  }
}
