package Homework.HomeworkLesson8;

public class Class2 {

  public static final double pi = 3.14;

    public double areaOfCircle (double radius) {
      double pl = pi * radius * radius;
      return pl;
    }

    public static double circumference (double radius) {
      double dl = 2 * pi * radius;
      return dl;
    }

    public void info (double radius) {
      System.out.println("Radius = " + radius);
      System.out.println("Ploshad kruga = " + areaOfCircle(radius));
      System.out.println("Dlina okrujnosti = " + circumference(radius));
    }
  }

  class Test1 {

    public static void main(String[] args) {

      Class2 c = new Class2();
      System.out.println(c.areaOfCircle(5.5));
      System.out.println(Class2.circumference(3.4));
      c.info(5.5);
    }

  }

