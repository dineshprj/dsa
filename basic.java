import java.util.*;
public class fibonic{
    public static int fib(int n){
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        
        for(int i=2;i<n;i++){
            int fibo=first+second;
            System.out.print(fibo+" ");
               first=second;
               second=fibo;
        }
        return n;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your numbers :");
        int n =sc.nextInt();
       System.out.print(fib(n));
}
}
