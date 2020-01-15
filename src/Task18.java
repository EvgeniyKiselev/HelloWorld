import java.io.*;
//Выгрузка данных из файла, проверка и перезапись
public class Task18 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String inputString;
        int lineNumber = 0;
        BufferedReader bufferRead = new BufferedReader(new FileReader("notes.txt"));
        System.out.println("Данные из файла notes: ");
        while ((inputString = bufferRead.readLine()) != null) {
            lineNumber++;
            System.out.println(inputString);
            }
        bufferRead.close();
        System.out.println("Введите новые данные для записи в файл notes ");
        BufferedReader inputRead = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writerToFile = new FileWriter("notes.txt");
        for (int i = 0; i <= lineNumber - 1; i++) {
            System.out.print(": ");
            inputString = inputRead.readLine();
            writerToFile.write(inputString + "\n");
        }
        bufferRead.close();
        writerToFile.close();
        System.out.println("Новый текст записан в файл notes.txt");
    }
}