import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fibn = fib(n);
    System.out.println(fibn);
 }
 public static int fib(int n){
     if(n == 0 || n==1){
         return n;
     }
     int fibn1 = fib(n-1);
     int fibn2 = fib(n-2);
     
     int fibn = fibn1 + fibn2;
     
     return fibn;
 }

}