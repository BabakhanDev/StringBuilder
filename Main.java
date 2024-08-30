package IoFiles;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("java15.txt");

           fileWriter.write("""
                    ...............................Peaksoft..............................
                    Course: Java
                    Group java15:
                    Instructor: Mukhambet
                    Mentor: Urmat
                    Students: rthtjrjrtjrjerhwrjrhr,rehrhehr,erhehre,rehre,herh,erherh""");

         fileWriter.close();

 FileReader fileReader = new FileReader("java15.txt") ;
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            fileReader.close();
        } catch (IOException e) {
        throw new RuntimeException(e);
    }

    }}

