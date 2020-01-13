import java.io.*;
//Выгрузка данных из файла на экран
public class Task16 {
    public static void main(String[] args) {
            String s;
        try (BufferedReader br = new BufferedReader
                (new FileReader("C://Users//...//Desktop//notes.txt")))
        {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}