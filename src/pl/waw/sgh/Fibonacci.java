package pl.waw.sgh;


import java.util.Scanner;

public class Fibonacci {

     public double fibSeq(int n){
         if(n<3){
             return 1;
         }else{
             return fibSeq(n-1)+ fibSeq(n-2);
         }
     }
    public static void main(String[] args) {
         int howmany  ;
        System.out.println("Give me a length \n");
        Scanner S=new Scanner(System.in);
        howmany= S.nextInt();
        Fibonacci fib= new Fibonacci();
        fib.doFib(howmany );

    }


    public void doFib(int howmany){
         int n;
         for( n=1;n<=howmany;n++){
             System.out.println(fibSeq(n));
         }


    }


    }
