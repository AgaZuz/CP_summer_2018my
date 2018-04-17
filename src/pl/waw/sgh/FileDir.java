package pl.waw.sgh;

import java.io.File;
import java.util.Scanner;

public class FileDir {

    private int numbOfFiles=0;
    private int sizeOfFiles=0;

    public  void extractFile(File filer){

        boolean isDir = filer.isDirectory();

      //  System.out.println(isDir);

        if (isDir ) {
            File[] subFiles = filer.listFiles();
            for (File f : subFiles) {
                numbOfFiles++;
                sizeOfFiles+=f.length();
                extractFile(f);
                System.out.println(f);

               //System.out.println(f.getName() + " " + f.length());
            }

        }

    }

    public  void specifyPath(String path){
        //Reading the path as a File
        File myfile = new File(path);

        //Extracting directory
        extractFile(myfile);

        // Conclusions
        System.out.println("number of files+subfolder: " + numbOfFiles  + " size of the files+subfolders in bytes: " + sizeOfFiles);
        //System.out.println("number of files+subfolder: " + numbOfFiles  + " size of the files+subfolders in mb: " + Math.round(sizeOfFiles/1000000));
        System.out.println("For some reason windows sometimes generate desktop.ini which is a hidden file, The program might detect it and therefore change the expected output from the directory. ");

        //reset the variables
        numbOfFiles=0;
        sizeOfFiles=0;
    }

    public static void main(String[] args) {
        FileDir file = new FileDir();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please specify path to the folder/file");
        file.specifyPath(scan.nextLine());
        


    }
}