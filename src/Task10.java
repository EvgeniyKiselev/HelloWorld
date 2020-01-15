import java.util.Scanner;
//Ввод/вывод данных для матрицы
public class Task10 {
    public static void main(String[] args) {
        Scanner scanInputInt = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int matrixRowsNum = scanInputInt.nextInt();
        System.out.println("Введите количество столбцов: ");
        int matrixColumnsNum = scanInputInt.nextInt();
        int mat[][] = new int[matrixRowsNum][matrixColumnsNum];
        System.out.println("Введите значения матрицы поочередно: ");
        for (int o = 0; o < matrixRowsNum; ++o) {
            for (int p = 0; p < matrixColumnsNum; ++p) {
                mat[o][p] = scanInputInt.nextInt();
            }
        }

        System.out.println("Значения первой строки матрицы, умноженные на 3: ");
        for (int i = 0; i < matrixColumnsNum; i++) {
            System.out.print(mat[0][i] * 3 + "  ");
        }

    }
}
