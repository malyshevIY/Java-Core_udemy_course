package Lesson2;


/* Диапозон целочисленных (integers) значений:
 Диапозон byte [-128; 127], размер 8 бит;
 Диапозон short [-32768; 32767], размер 16 бит;
 Диапозон int [-2147483648; 2147483647], размер 32 бит;
 Диапозон long [-9223372036854775808; 9223372036854775807], размер 64 бит;

   Диапозон вещественных (float-point) значений:
 Диапозон float [-3.4e-38; -3.4e+38;], размер 32 бит;
 Диапозон double [-1.7e-308; -1.7e+308;], размер 64 бит;

  Символьный тип данных:
 Диапозон char [0; 65535;], размер 16 бит; - значение данного типа всегда находится в одинарных
 кавычках и он должен быть один. Например 'Ф'
*/

public class PrimitiveDataTypes {

  public static void main(String[] args) {

    byte b1 = 10;
    byte b2 = 20;
    byte b3 = 100;

    short s1 = 5;
    short s2 = -10;
    short s3 = 0;

    int i1 = 500;

    long l1 = 1000;
    long l2 = 10000000000L; // Если хотим использловать тип данных long, то на конце каждого числа должны ставить L
    long l3 = 51L;

    float f1 = 3.14F; // Если хотим использловать тип данных long, то на конце каждого числа должны ставить F
    float f2 = 2.5F;
    float f3 = 20; // Проблем не возникает, и не нужно на конце писать F, так как целое число относится к int

    double d1 = 5.5;
    double d2 = 87.65;

    char c1 = 'a';
    char c2 = 'A';
    char c3 = '4';
    char c4 = ' ';

    char c5 = 300; // будет содержать значение 300-го символа в юникоде, используется 10-я система счисления

    char c6 = '\u1234'; // тоже выводит значения символов из юникода - но при такой записи нужно использовать 4 цифры,
    // испоьзуется 16-я система счисления
    
    boolean bool1 = true;
    boolean bool2 = false;

    int a1 = 60; // 10-я система счисления
    int a2 = 0B111100; // 2-я система счисления
    int a3 = 074; // 8-я система счисления (впереди 0)
    int a4 = 0x3C; // 16-я система счисления (впереди 0x)
    

    System.out.println(b1);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(a4);

  }

}