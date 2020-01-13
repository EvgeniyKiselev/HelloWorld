import java.util.Scanner;
//Ввод строки с клавиатуры
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        System.out.print("Вы ввели строку: " + s);
    }
}