/**
 * Created by leleluattila on 10/12/15.
 */

//This programm inputs 2 numbers from user and compares them

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("This program compares two numbers, so... ");
        System.out.println("Please enter a number");
        int num = userInput.nextInt();
        System.out.println("Enter second number");
        int numberTofind = userInput.nextInt();

        if (numberTofind<num){
            System.out.println("Number " + numberTofind + " is smaller than " + num);
        }else{
            System.out.println("Number " + numberTofind + " is greater than " + num);
        }

    }
}