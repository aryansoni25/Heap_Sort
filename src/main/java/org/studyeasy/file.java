package org.studyeasy;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        try {
            File f = new File("sample.txt"); // or just "sample.txt" if placed in target/classes
            Scanner sc = new Scanner(f);
            System.out.println("File Content: ");
            while (sc.hasNextLine()) {
                String lr = sc.nextLine();
                System.out.println(lr);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error : File not found!");
            e.printStackTrace();
        }
    }
}