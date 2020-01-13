import java.util.Scanner;
//Преобразование типов
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String S = sc.nextLine();
        int X = Integer. parseInt(S);
        double Y = (double) X;
        System.out.println("String: " + S + "\n" + "Int: " + X + "\n" + "Double: " + Y);
    }
}