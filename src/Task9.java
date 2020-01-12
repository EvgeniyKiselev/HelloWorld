import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int masL = sc.nextInt();
        int mas[] = new int[masL];
        System.out.println("Введите значения элементов массива: ");
        for (int i = 0; i < masL; i++) {
            mas[i] = sc.nextInt();
        }
        System.out.println("Элементы вашего массива, умноженные на 2: ");
        for (int y = 0; y < masL; y++) {
            System.out.println(mas[y] * 2);
        }
    }
}
