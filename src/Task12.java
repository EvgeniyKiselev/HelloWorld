import java.util.Scanner;
//Удаление всех пробелов в заданном тексте
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        String sWthtSpace = s.replaceAll(" ", "");
        System.out.print("Введенная строка без пробелов: " + sWthtSpace);
    }
}

/* Optimization
 System.out.println("Введите строку: ");
 String str = new;
 Scanner(System.in).nextLine();
 System.out.print("Введенная строка без пробелов: " + str.replaceAll(" ","");
 */