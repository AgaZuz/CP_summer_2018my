package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReadTxt {

    final static String FILE = "h:\\myfile.txt";

    public static void main(String[] args) {
        File myFile = new File(FILE);
        try {
            Scanner sscanner = new Scanner(myFile);
            int i = 0;
            while (Scanner.hasNext()) {
String line= sscanner.nextLine();
i++;
                System.out.println("Line"+ i + ":"+ line);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}