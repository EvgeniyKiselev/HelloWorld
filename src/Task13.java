import java.util.Scanner;
//Сравнение двух строк
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String firstStr = sc.nextLine();
        System.out.println("Введите вторую строку: ");
        String secondStr = sc.nextLine();
        if (firstStr.length() > secondStr.length()) {
            System.out.println(firstStr);
        }
        else if (firstStr.length() < secondStr.length()) {
            System.out.println(secondStr);
        }
        else
            System.out.println("Обе строки имеют одинаковую длину: " + firstStr.length());
    }
}