import java.util.Scanner;
//Ввод/вывод данных для матрицы
public class Task10 {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int matH = sc.nextInt();
        System.out.println("Введите количество столбцов: ");
        int matL = sc.nextInt();
        int mat[][] = new int[matH][matL];
        System.out.println("Введите значения матрицы поочередно: ");
            for (int o = 0; o < matH; ++o) {
                for (int p = 0; p < matL; ++p) {
                    mat[o][p] = sc.nextInt();
                }
            }
        System.out.println("Значения первой строки матрицы, умноженные на 3: ");
            for (int i = 0; i < matL; i++) {
            System.out.print(mat[0][i] * 3 + "  ");
        }

    }
}
