import java.util.Scanner;

///Отработка арифметических операций

public class Task6 {
    public static void main(String[] args) {
        Scanner scanInputInt = new Scanner(System.in);
        System.out.println("Вам нужно ввести 3 числа (x, y, z)");
        System.out.println("Введите x: ");
        int x = scanInputInt.nextInt();
        System.out.println("Введите y: ");
        int y = scanInputInt.nextInt();
        System.out.println("Введите z: ");
        int z = scanInputInt.nextInt();
        int average = (x + y + z) / 3;
        double averageCutOn2 = average % 2;

        System.out.println("Среднее арифметическое введенных чисел: " + average);
        if (averageCutOn2 == 0) {
            System.out.println("Среднее арифметическое, деленное на 2 без остатка: " + average/2);
        }
        else {
            System.out.println("Среднее арифметическое введенных чисел не делится на 2 без остатка");
        }
        if (averageCutOn2 == 0 && average / 2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}