import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        String ss = s.replaceAll(" ", "");
        System.out.print("Введенная строка без пробелов: "+ ss);

    }
}