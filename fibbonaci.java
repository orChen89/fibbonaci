import java.util.Scanner;

public class fibbonaci {

    public static void main(String[] args) {
    
        System.out.println("Please enter an index number to receive its Fibbonaci number:");
        int firstNum = 0;
        int secNum = 1;
        int fibNum = 0;
        Scanner scanner = new Scanner(System.in);
        double position = scanner.nextDouble();

        if (position == 1) {
            fibNum = firstNum;
            System.out.println("The First Fibbonaci number is " + fibNum);

        }else if (position < 0) {
            System.out.println("An index must be a positive number!");

        }else if (position == 2) {
            fibNum = secNum;
            System.out.println("The 2nd Fibonacci number is: " + fibNum);

        }else if (position == 3){
            fibNum = secNum;
            System.out.println("The 3rd Fibonacci number is: " + fibNum);

        }else{
            for (int i = 3; i <= position; i++) {
               position = (int) position;
               fibNum = secNum + firstNum;
               firstNum = secNum;
               secNum = fibNum;}
               System.out.println("The " + (int) position + "th" + " index number is the Fibonacci number: " + fibNum);

            }

        }

    }
