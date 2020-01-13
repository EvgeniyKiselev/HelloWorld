import java.util.Scanner;
//Условие вывода данных
public class Task7 {
    public static void main(String[] args) {
        final int X = 7;
        final int Y = 35;
        final int Z = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите с клавиатуры число, оно будет присвоено переменной number:");
        int number = sc.nextInt();
        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }

    }
}