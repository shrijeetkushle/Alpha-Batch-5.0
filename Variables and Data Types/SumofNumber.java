import java.util.*;
public class SumofNumber{
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number 1 :");
        int number1=sc.nextInt();
        System.out.print("Enter number 2:");
        int number2=sc.nextInt();
        int sum=number1+number2;
        System.out.println("Sum of number is :"+sum);
    }
}