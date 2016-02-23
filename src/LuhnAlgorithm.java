// ***** Luhn algorithm *****
// **************************

import java.util.Scanner;

public class LuhnAlgorithm {
    public static void main(String[] args) {
        LuhnAlgorithm t1 = new LuhnAlgorithm();
        t1.menu();

    }

    // ***** algorithm for numbers that consist of two digits *****
    public static int doubleDigitValue(int digit){
        int doubleDigit = digit * 2;
        int sum;
        if (doubleDigit >= 10){
            sum = 1 + doubleDigit % 10;
        }else sum = doubleDigit;
        return sum;
    }

    public void menu(){
        Scanner userInput = new Scanner(System.in);
        char digit;
        int checksum = 0;

        System.out.println("enter digit no: ");
        for (int position = 1; position <= 6; position++) {     // number of digits to be entered
            digit = userInput.next().charAt(0);
                if (position % 2 == 0){                         //check which numbers need to be doubled
                    checksum += digit - '0';
                }else {
                    checksum += doubleDigitValue(digit - '0');
                }
        }

        // ***** prints sum of numbers and if it is valid *****
        System.out.println("sum: "+checksum);
        if (checksum % 10 == 0){
            System.out.println("valid no.");
        }else{
            System.out.println("invalid no.");
        }
    }
}
