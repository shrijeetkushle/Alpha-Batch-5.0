import java.util.*;
public class isprime {
    public static boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            return false;
        }
    }
    return true;
}
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        isprime(n);
    }
}
