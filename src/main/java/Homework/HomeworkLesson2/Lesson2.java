package Homework.HomeworkLesson2;

public class Lesson2 {

  public static void main(String[] args) {

    byte a1 = 12;
    byte a2 = 0B1100;
    byte a3 = 014;
    byte a4 = 0xC;

    System.out.println("10-я система счисления " + a1);
    System.out.println("2-я система счисления " + a2);
    System.out.println("8-я система счисления " + a3);
    System.out.println("16-я система счисления " + a4);
    System.out.println();

    short b1 = 1300;
    short b2 = 0B010100010100;
    short b3 = 02424;
    short b4 = 0x514;

    System.out.println("10-я система счисления " + b1);
    System.out.println("2-я система счисления " + b2);
    System.out.println("8-я система счисления " + b3);
    System.out.println("16-я система счисления " + b4);
    System.out.println();

    int c1 = 0;
    int c2 = 0B0;
    int c3 = 00;
    int c4 = 0x0;

    System.out.println("10-я система счисления " + c1);
    System.out.println("2-я система счисления " + c2);
    System.out.println("8-я система счисления " + c3);
    System.out.println("16-я система счисления " + c4);
    System.out.println();

    long d1 = 123456789L;
    long d2 = 0B0111_0101_1011_1100_1101_0001_0101L;
    long d3 = 0726_746_425L;
    long d4 = 0x75BCD15L;

    System.out.println("10-я система счисления " + d1);
    System.out.println("2-я система счисления " + d2);
    System.out.println("8-я система счисления " + d3);
    System.out.println("16-я система счисления " + d4);
    System.out.println();

    float f1 = 3.14F;
    float f2 = 2.5F;

    double i1 = 1000000.545;
    double i2 = -745000.645;

    boolean bool1 = true;
    boolean bool2 = false;

    System.out.println("float " + f1);
    System.out.println("float " + f2);
    System.out.println("double " + i1);
    System.out.println("double " + i2);
    System.out.println("boolean " + bool1);
    System.out.println("boolean " + bool2);
    System.out.println();

    char char1 = 'Z';
    char char2 = ' ';
    char char3 = 7777;
    char char4 = '\u7777';

    System.out.println("char " + char1);
    System.out.println("char " + char2);
    System.out.println("char " + char3);
    System.out.println("char " + char4);
    System.out.println();

  }

}
