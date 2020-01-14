import java.util.Scanner;
//Сортировка данных в массиве
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int masL = sc.nextInt();
        int mas[] = new int[masL];
        System.out.println("Введите значения элементов массива: ");
        for (int i = 0; i < masL; i++) {
            mas[i] = sc.nextInt();
        }
        for(int i = mas.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int n = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = n;
                }
            }
        }
        System.out.println("Элементы вашего массива, отсортированные метедом пузырька: ");
        for (int y = 0; y < masL; y++) {
            System.out.print(mas[y] + " ");
        }
    }
}