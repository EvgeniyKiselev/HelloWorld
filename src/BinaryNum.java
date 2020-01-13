import java.util.Scanner;
//Отработка поразрядных операций
public class BinaryNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в двоичной системе: ");
        String bin = sc.nextLine();
        int binNum = Integer.parseInt(bin, 2);
        System.out.println(binNum);
    }
}


