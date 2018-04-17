package pl.waw.sgh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class klasa {
    final static String FILE = "C:\\Users\\Aga\\IdeaProjects\\CP_summer_2018my\\agnieszka.csv";

    public  void readCsv (String[] args) {

    }
    public static void main(String[] args) {
        //System.out.println("File separator: " + File.separator);
        File myFile = new File(FILE);
        int[][] arrTicTac= new int[2][2];

        try {
            Scanner scanner = new Scanner(myFile);
            //int i = 0;
            int x=0;
            int y=0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] cells = line.split(";");

                for (String el : cells) {
                    //System.out.println("El: " + el);
                    int a = Integer.parseInt(el);


                    arrTicTac[x][y]=a;
                    y++;

                    System.out.println(arrTicTac[x][y]);
                }
                x++;


            }
            // System.out.println("New line");
            //i++;
            //System.out.println("Line " + i + " : " + line);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





    }
    /*public boolean checkWith(int[][] array){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if()
            }*/
        }


