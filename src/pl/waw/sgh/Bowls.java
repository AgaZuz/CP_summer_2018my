package pl.waw.sgh;

import java.util.Scanner;

public class Bowls {
    public  static int doBowls(int n){
        if(n==1){
            return 1;
        }else
       return doBowls(n-1)+n;
    }

    public static void main(String[] args) {
        int n=1;

        int howmany;
        System.out.println("Give me a number of rows \n");
        Scanner S=new Scanner(System.in);
        howmany= S.nextInt();
        Bowls bow= new Bowls();
        bow.doBowls(howmany);
        while(n<=howmany){



           if (n==howmany){
               System.out.println(doBowls(n));
           }n++;
        }
    }
}
