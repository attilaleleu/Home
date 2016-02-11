/**
 * Created by leleluattila on 08/12/15.
 */

// This program inputs a number from user and multiplies it starting from 1

import java.util.Scanner;

public class Problema1B {
    public static void main(String[] args){

        Scanner k = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int x = k.nextInt();
        int i;

        for (i=1; i<20; i++){
            System.out.println(i*x);
        }

    }
}
