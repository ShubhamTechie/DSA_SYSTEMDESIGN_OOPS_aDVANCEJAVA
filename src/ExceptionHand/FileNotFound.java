package ExceptionHand;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFound {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("please enter file name");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.println((char) read);
            }
        } catch (FileNotFoundException exc) {
            System.out.printf("%s not found ", fileName);

        } catch (IOException exception) {
            System.out.printf("exception occurs  : %s", exception.getMessage());
        }
    }
}