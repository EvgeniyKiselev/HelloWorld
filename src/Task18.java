import java.io.*;
//Выгрузка данных из файла, проверка и перезапись
public class Task18 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String s;
        int lineNumber = 0;
        BufferedReader br = new BufferedReader(new FileReader("C://Users//EKiselev//Desktop//notes.txt"));
        System.out.println("Данные из файла notes: ");
        while ((s = br.readLine()) != null) {
            lineNumber++;
            System.out.println(s);
            }
        br.close();
        System.out.println("Введите новые данные для записи в файл notes ");
        BufferedReader ir = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter("C://Users//EKiselev//Desktop//notes.txt");
        for (int i = 0; i <= lineNumber - 1; i++) {
            System.out.print(": ");
            s = ir.readLine();
            writer.write(s + "\n");
        }
        br.close();
        writer.close();
        System.out.println("Новый текст записан в файл notes.txt");
    }
}