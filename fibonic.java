// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static int fib(int n){
        //base casses
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
            return fib(n-1)+fib(n-2);
    }
    
    public static void fibseries(int n){
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter your numbers : ");
        int n=sc.nextInt();
        fibseries(n);
    }
}
