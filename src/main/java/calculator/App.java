package calculator;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    static double Sqrt(double x){
        return Math.sqrt(x);
    }
    public static void main( String[] args )
    {
        int ch;
        Scanner scan = new Scanner(System.in);
        boolean flag=true;
        do{
            System.out.println("-----------Your Menu-------------");
            System.out.println("Enter 1 for Finding Square Root");
            System.out.println("Enter 2 for Finding Factorial");
            System.out.println("Enter 3 for Finding Natural Log(base e)");
            System.out.println("Enter 4 for Finding Power");
            System.out.println("Enter any other character to exit");
            System.out.print("Enter your choice: ");
            ch=scan.nextInt();
            switch(ch){
                case 1:
                    double x;
                    System.out.print("Enter the number to find square root: ");
                    x=scan.nextDouble();
                    System.out.println("The square root of "+x+" is "+ Sqrt(x));
                    break;
                default:
                    flag=false;
            }
        }while(flag);
    }
}
