import java.util.Scanner;

//Удаление всех пробелов в заданном тексте

public class Task12 {
    public static void main(String[] args) {
        Scanner scanInputString = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanInputString.nextLine();
        System.out.print("Введенная строка без пробелов: " + inputString.replaceAll(" ",""));
    }
}

/* Optimization
 System.out.println("Введите строку: ");
 String str = new;                      //ругается на эту и следующую строку
 Scanner(System.in).nextLine();
 System.out.print("Введенная строка без пробелов: " + str.replaceAll(" ","");
 */