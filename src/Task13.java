import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String s1 = sc.nextLine();
        System.out.println("Введите первую строку: ");
        String s2 = sc.nextLine();
        if (s1.length() > s2.length()) {
            System.out.println(s1);
        }
        if (s1.length() < s2.length()) {
            System.out.println(s2);
        }
        else
            System.out.println("Обе строки имеют одинаковую длину: " + s1.length());

    }
}