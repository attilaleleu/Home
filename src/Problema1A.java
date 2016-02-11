/**
 * Created by leleluattila on 08/12/15.
 */

//This program prints de divisors of a given number

import java.util.Scanner;

public class Problema1A {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = k.nextInt();
        int rez;

        for(int i=1; i>=1; i++){
            rez = num%i;
            if((rez==0) && (num!=i)){
                System.out.println("Divisor is: " +i);
            }
        }

    }
}
