import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        int o, p;
        int g, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту матрицы: ");
        int matH = sc.nextInt();
        System.out.println("Введите длину матрицы: ");
        int matL = sc.nextInt();
        int mat[][] = new int[matH][matL];
        System.out.println("Введите значения матрицы поочередно: ");


            for (o = 0; o < matH; ++o) {
                for (p = 0; p < matL; ++p) {
                    mat[o][p] = sc.nextInt();
                }
            }

        System.out.println("Значения первой строки матрицы, умноженные на 3: ");
        System.out.println("\n");

        for (int i = 0; i < mat.length; i++) {
            System.out.print((mat[0][i]*3) + "  ");

        }

    }
}
