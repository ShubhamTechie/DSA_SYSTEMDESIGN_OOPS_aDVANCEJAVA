package ExceptionHand;

import java.io.*;

public class FileHandling {


    public static void main(String[] args) {


        String fileName = "java=course.txt";
//        try (FileWriter writer = new FileWriter(fileName)) {
//
//            writer.write("this is the best java lecture");
//            writer.flush();
//            System.out.println("file written successfully");
//        } catch (IOException exception) {
//            System.out.printf("Exception occurred %s\n", exception.getMessage());
//
//        }


        try(FileReader reader = new FileReader(fileName)){
            int read=0;
            do {
                read =  reader.read();
                System.out.print((char)read);
            }while (read != -1);

        }catch (IOException e){
            System.out.printf("exception occurred : %s", e.getMessage());
        }

    }


}
