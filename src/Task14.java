import java.util.Scanner;

//Преобразование типов

public class Task14 {
    public static void main(String[] args) {
        Scanner scanInputString = new Scanner(System.in);
        System.out.println("Введите число: ");
        String S = scanInputString.nextLine();

        ///Имена переменных заданы в задаче

        int X = Integer. parseInt(S);
        double Y = (double) X;
        System.out.println("String: " + S + "\n" + "Int: " + X + "\n" + "Double: " + Y);
    }
}