import java.io.*;

//Выгрузка данных из файла на экран

public class Task16 {
    public static void main(String[] args) {
        String stringFromFile;
        try (BufferedReader bufferRead = new BufferedReader
                (new FileReader("notes.txt")))
        {
            while ((stringFromFile = bufferRead.readLine()) != null) {
                System.out.println(stringFromFile);
            }
        } catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}