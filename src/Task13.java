import java.util.Scanner;

//Сравнение двух строк

public class Task13 {
    public static void main(String[] args) {
        Scanner scanInputString = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String firstScannedStr = scanInputString.nextLine();
        System.out.println("Введите вторую строку: ");
        String secondScannedStr = scanInputString.nextLine();

        if (firstScannedStr.length() > secondScannedStr.length()) {
            System.out.println(firstScannedStr);
        }
        else if (firstScannedStr.length() < secondScannedStr.length()) {
            System.out.println(secondScannedStr);
        }
        else
            System.out.println("Обе строки имеют одинаковую длину: " + firstScannedStr.length());
    }
}