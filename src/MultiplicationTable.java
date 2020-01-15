import java.util.Scanner;

///Таблица умножения

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 10: ");
        int num = sc.nextInt();

        System.out.println(num);
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(num * 4);
        System.out.println(num * 5);
        System.out.println(num * 6);
        System.out.println(num * 7);
        System.out.println(num * 8);
        System.out.println(num * 9);
        System.out.println(num * 10);
    }
}
