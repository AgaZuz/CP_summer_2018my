package pl.waw.sgh;

import java.util.Scanner;

public class Email {
    public void checkEmail(String email) {

        if (email.indexOf('@') != -1) {



            if (email.indexOf('@') != email.lastIndexOf("@")) {
                System.out.println("Email address is not valid");
                //ma więcej niz jedną małpę

            }

            String part = email.substring(0, email.lastIndexOf("@"));
            String domain = email.substring(email.lastIndexOf("@"), email.length());
            if (email.indexOf("@.") != -1) {
                System.out.println("Email address is not valid,3");
                //jedna bezposrednio kropka przed małpą
            } else if (email.indexOf(" ") != -1) {
                System.out.println("Email address is not valid");

            } else if (email.indexOf("..") != -1) {
                System.out.println("Email address is not valid");
                //brak dwóh kropek obok siebie
            } else if (email.charAt(0) == '.') {
                System.out.println("Email address is not valid");
                //dot is not the first  character (-)
            } else if ((part.length() > 64 || part.length()==0) || (domain.length() > 253) || (domain.length() == 0)) {
                System.out.println("Email address is not valid");
            } else {

                System.out.println("I chcecked a few ctiteria and Email address may be valid");
            }
        }else {
            System.out.println("Email address is not valid");
            //nie ma małpy
        }
    }


    public static void main(String[] args) {
        Email email = new Email();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Please give your email address ");
            String str = s.nextLine();
            email.checkEmail(str);
        }



    }
}
