package Class9;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*2-Create a program that will be asking user to apply for a credit card 10 times.
        As soon you get an “yes” from a user program should stop asking.
         */

        Scanner scan=new Scanner(System.in);

        for (int i = 1; i <=10 ; i++) {
                System.out.println("Do you want to apply for a credit card");
        String userInput= scan.next();
        if (userInput.equalsIgnoreCase("yes"))
                break;
            }


        }


    }

