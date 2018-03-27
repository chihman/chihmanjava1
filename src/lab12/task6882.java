package lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task6882 {
    public static void main(String[] args) {
        try {


            String filename = "res\\files\\task6882\\test6.txt";
            File target = new File(filename);
            Scanner reader = new Scanner(target);
            int a = 10000;
            int b;
            while (reader.hasNext()) {
                String line = reader.nextLine();
                b = Integer.parseInt(line);
                if (b < a) {
                    a = b;
                }

            }
            System.out.print(a);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден ");


        } catch (java.lang.NumberFormatException t) {
            System.out.println("Не удается считать число ");


        }

    }
}
