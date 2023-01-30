//////////////////// USLOVIYA i CIKLi
//////////////////// operator 'if'

if (a > 0) {
   System.out.println("Uslovie vipolneno");
}

//////////////////// operator 'if + else'

if (a > 0) {
   System.out.println("Glavnoe uslovie vipolneno");
} else if (a < 0) {
   System.out.println("Uslovie vipolneno");
} else if (a == 0) {
   System.out.println("Uslovie vipolneno");
} else {
   System.out.println("Uslovie ne vipolneno");
}

//////////////////// ternarniy operator
a == 0 || a > 0 || a < 0 ? "ravno" : "ne ravno";

//////////////////// operator switch
int grade = 3;

class Main {
  public static void main(String[] args) {
    int grade = 3;

    switch (grade) {
      case 5:
        System.out.println("Otlichno!");
        break;
      case 4:
        System.out.println("khorosho!");
        break;
      case 3:
        System.out.println("Sredne!");
        break;
      case 2:
        System.out.println("Mozhno luchshe!");
        break;
      case 1:
        System.out.println("Pridetsya peredelat'.");
        break;
      default:
        System.out.println("Nevernaya otsenka");
    }
  }
}

//////////////////// operator switch
public class Loader {

   public static void main(String[] args) {
       char ch1 = 'h';
       char ch2 = 'i';
       char ch3 = 'b';

       System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
   }
  
   public static String decode(char ch) {

  String result = "";
        switch (ch) {
            case 'h':
                result = "Hello!";
                break;
            case 'i':
            case 'm':
            case 'k':
                result = "I can decode!";
                break;
            case 'b':
                result = "Bye!";
                break;
            default:
                result = "I don’t know these symbols:(";
        }
        return result;
    }
}

//////////////////// cikl 'while'
while (true) {                               //условно бесконечный цикл
  
}

//////////////////// cikl 'while'
class Main {
  public static void main(String[] args) {
    int a = 0;
    while (a <= 10) {
      System.out.println(a++);                // ответ в консоль будет: цифры 0-10
    }
  }
}

//////////////////// cikl 'do+while'
class Main {
  public static void main(String[] args) {
    int i = 100;
    do {
      System.out.println("YA vypolnilsya");
    } while (i < 10);                        //так как проверка после блока 'do', будет выполнена как минимум одна итерация
  }
}

//////////////////// cikl 'for'  
class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i += 10) {
            System.out.println("Stroka " + i);
        }
  }
}

//////////////////// cikl 'for+break'  
for (int i = 0; i < 100; i += 10) {
   
   System.out.println("Строка " + i);
    if (i == 50) {                              //цикл остановится, когда достигнет 50
       break;
   }
}

//////////////////// cikl 'for+continue' 
for (int i = 0; i < 100; i += 10) {
   if (i == 50) {
       continue;                                //цикл попустит вывод в консоль числа 50 и продолжит дальше
   }
   System.out.println("Строка " + i);
}

//////////////////// Zadanie 20.2.1 
/* Используя цикл do...while, напишите программу, которая уменьшает значение i до тех пор, пока оно больше 1.
В программе должна выполнится хотя бы одна итерация.*/
public class Loader {
    public static void main(String[] args) {
        int i = 10;
        do {i--;} while (i > 1);
        System.out.println("Value i = " + i);
    }
}

//////////////////// Zadanie 20.2.4
/* Дополните программу, используя цикл while, так, чтобы программа увеличивала переменную i на 1, пока переменная не станет равна 350.*/
public class Loader {
    public static void main(String[] args) {
        int i = 45;
        while(i<350) {
            i++;
        }

        System.out.println("Value i = " + i);
    }
}
