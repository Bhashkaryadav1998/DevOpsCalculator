package calculator;

import java.util.*;

public class App 
{
    static double pow(double x,double b){
        return Math.pow(x,b);
    }
    static double Sqrt(double x){
        return Math.sqrt(x);
    }
    static double ln(double x){
        return Math.log(x);
    }
    static long fact(int x){
        if(x<0) return -1;
        long res=1;
        int i;
        for(i=1;i<=x;i++) res*=i;
        return res;
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
                case 2:
                    System.out.print("Enter the number to find factorial: ");
                    int a=scan.nextInt();
                    if(fact(a)>0) System.out.println("Factorial of "+a+" is "+fact(a));
                    else System.out.println("Factorial of "+a+" is not possible");
                    break;
                case 3:
                    System.out.print("Enter a number to find Natural Log: ");
                    double t=scan.nextDouble();
                    System.out.println("log to base e of "+t+" is "+ln(t));
                    break;
                case 4:
                    double b;
                    System.out.print("Enter x: ");
                    x=scan.nextDouble();
                    System.out.print("Enter b: ");
                    b=scan.nextDouble();
                    System.out.println(x+" raised to power "+b+" is "+pow(x,b));
                    break;
                default:
                    flag=false;
            }
        }while(flag);
    }
}
