package DomLabs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dom_ssylki {
    public static void main(String[] args) {
        try {
            String filename = "res\\files\\test txt\\test1.txt";
            File target = new File(filename);
            Scanner reader = new Scanner(target);

            String filename2 = "res\\files\\test txt\\test2.txt";
            File target2 = new File(filename2);
            Scanner reader2 = new Scanner(target2);

            int a , b , c;

            while (reader.hasNext()) {
                String line = reader.nextLine();
                a = Integer.parseInt(line);

                String line2 = reader2.nextLine();
                b = Integer.parseInt(line2);

                c = a - b;
                System.out.printf(c + "\n");
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден ");
        } catch (java.lang.NumberFormatException t) {
            System.out.println("Не удается считать число ");
        }
    }
}
