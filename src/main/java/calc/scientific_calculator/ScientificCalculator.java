package calc.scientific_calculator;

import java.lang.Math;
import java.util.Scanner;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class ScientificCalculator {

    //private static final Logger logger = LogManager.getLogger(Calculator.class);
    /*public ScientificCalculator() {
    }*/

    public static double sqrt(double num){
        return Math.sqrt(num);
    }

    public static int factorial(int num){
        int fact = 1;
        for(int idx= 1; idx <= num; idx++){
            fact *= idx;
        }
        return fact;
    }

    public static double ln(double num){
        return Math.log(num);
    }

    public static double pow(double num, double b){
        return Math.pow( num, b);
    }

    public static void main(String[] args) {

        //ScientificCalculator calculator = new ScientificCalculator();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while(choice != 5){
            System.out.println("\nWelcome to ScientificCalculator 1.0! Follow the given instructions for a fruitful experience!");
            System.out.println("Enter 1 if you want to compute a factorial.");
            System.out.println("Enter 2 if you want to compute a square root");
            System.out.println("Enter 3 if you want to compute a natural logarithm.");
            System.out.println("Enter 4 if you want to compute a power.");
            System.out.println("Enter 5 if you have finished all your computations and want to exit.");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Very well, enter the integer you wish to find factorial for.");
                    int number_fact = scanner.nextInt();
                    System.out.println("The factorial of " + number_fact + " is " + ScientificCalculator.factorial(number_fact));
                    break;
                
                case 2:
                    System.out.println("Very well, enter the number you wish to find square root for.");
                    double number_root = scanner.nextDouble();
                    System.out.println("The square root of " + number_root + " is " + ScientificCalculator.sqrt(number_root));
                    break;
                
                case 3:
                    System.out.println("Very well, enter the number you wish to find natural logarithm for.");
                    double number_log = scanner.nextDouble();
                    System.out.println("The natural logarithm of " + number_log + " is " + ScientificCalculator.ln(number_log));
                    break;

                case 4:
                    System.out.println("Very well, enter the base.");
                    double base = scanner.nextDouble();
                    System.out.println("Please enter the exponent now.");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + "to the power of " + exponent + " is " + ScientificCalculator.pow(base, exponent));
                    break;
                
                case 5:
                    System.out.println("Hope you enjoyed our service! Bye for now!");
                    break;
            }
        }

        scanner.close();
    }

}