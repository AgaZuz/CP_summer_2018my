package pl.waw.sgh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    final static String FILE = "C:\\Users\\Aga\\IdeaProjects\\CP_summer_2018my\\agnieszka.csv";


    public static void main(String[] args) {
        int[][] arrTicTac= new int[3][3];
        //System.out.println("File separator: " + File.separator);
        File myFile = new File(FILE);
        boolean isOver=true;


        try {
            Scanner scanner = new Scanner(myFile);

            int x = 0;
            int y = 0;
            while (scanner.hasNext()) {

                String line = scanner.nextLine();
                String[] cells = line.split(";");

                for (String el : cells) {

                    System.out.println("El: " + el);
                    int a = Integer.parseInt(el);

                    arrTicTac[x][y] = a;
                    y++;


                }
                x++;
                y = 0;


            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (arrTicTac[i][j] == 0) {
                       // System.out.println("game is over");
                        isOver=false;
                    }

                }
                }



            if ((arrTicTac[0][0] == arrTicTac[0][1]) && (arrTicTac[0][0] == arrTicTac[0][2]) && arrTicTac[0][0] == 1) {
                System.out.println("1 player won");
                isOver=true;
            } else if ((arrTicTac[0][0] == arrTicTac[0][1]) && (arrTicTac[0][0] == arrTicTac[0][2]) && arrTicTac[0][0] == -1) {
                System.out.println("-1 player won");
                isOver=true;
            } else if ((arrTicTac[0][0] == arrTicTac[1][1]) && (arrTicTac[0][0] == arrTicTac[2][2]) && arrTicTac[0][0] == 1) {
                System.out.println("1 player won");
                isOver=true;
            } else if ((arrTicTac[0][0] == arrTicTac[1][1]) && (arrTicTac[0][0] == arrTicTac[2][2]) && arrTicTac[0][0] == -1) {
                System.out.println("-1 player won");
                isOver=true;
            } else if ((arrTicTac[0][2] == arrTicTac[1][1]) && (arrTicTac[1][1] == arrTicTac[2][0]) && arrTicTac[0][0] == 1) {
                System.out.println("1 player won");
                isOver=true;
            } else if ((arrTicTac[0][2] == arrTicTac[1][1]) && (arrTicTac[1][1] == arrTicTac[2][0]) && arrTicTac[0][0] == -1) {
                System.out.println("-1 player won");
                isOver=true;
            } else if ((arrTicTac[1][0] == arrTicTac[1][1]) && (arrTicTac[1][0] == arrTicTac[1][2]) && arrTicTac[1][0] == 1) {
                System.out.println("1 player won");
                isOver=true;
            } else if ((arrTicTac[1][0] == arrTicTac[1][1]) && (arrTicTac[1][0] == arrTicTac[1][2]) && arrTicTac[1][0] == -1) {
                System.out.println("-1 player won");
                isOver=true;
            } else if ((arrTicTac[2][0] == arrTicTac[2][1]) && (arrTicTac[2][0] == arrTicTac[2][2]) && arrTicTac[2][0] == 1) {
                System.out.println("1 player won");
                isOver=true;
            } else if ((arrTicTac[2][0] == arrTicTac[2][1]) && (arrTicTac[2][0] == arrTicTac[2][2]) && arrTicTac[2][0] == -1) {
                System.out.println("-1 player won");
                isOver=true;
            } else if ((arrTicTac[0][0] == arrTicTac[1][0]) && (arrTicTac[0][0] == arrTicTac[2][0]) && arrTicTac[2][0] == -1) {
                System.out.println("-1 player won");
                isOver=true;
            } else if ((arrTicTac[0][0] == arrTicTac[1][0]) && (arrTicTac[0][0] == arrTicTac[2][0]) && arrTicTac[2][0] == 1) {
                System.out.println("1 player won");
                isOver=true;
            } else if ((arrTicTac[0][1] == arrTicTac[1][1]) && (arrTicTac[0][1] == arrTicTac[2][1]) && arrTicTac[2][1] == -1) {
                System.out.println("-1 player won");
                isOver=true;
            } else if ((arrTicTac[0][1] == arrTicTac[1][1]) && (arrTicTac[0][1] == arrTicTac[2][1]) && arrTicTac[2][1] == 1) {
                System.out.println("1 player won");
                isOver=true;
            } else if ((arrTicTac[0][2] == arrTicTac[1][2]) && (arrTicTac[0][2] == arrTicTac[2][2]) && arrTicTac[2][2] == 1) {
                System.out.println("1 player won");
                isOver=true;
            } else if ((arrTicTac[0][2] == arrTicTac[1][2]) && (arrTicTac[0][2] == arrTicTac[2][2]) && arrTicTac[2][2] == -1) {
                System.out.println("-1 player won");
                isOver=true;

            }

            if(isOver){
                System.out.println("the game is done and Lukasz won");
            } else {
                System.out.println("the game is not over and no one won");
            }



               // System.out.println("New line");
                //i++;
                //System.out.println("Line " + i + " : " + line);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





    }



}
