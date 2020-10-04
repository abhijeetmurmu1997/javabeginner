import java.util.Scanner;
 
class ArmstrongNumber
{
  public static void main(String args[])
  {
    int n, sum = 0, t, remainder, digits = 0;
 
    Scanner in = new Scanner(System.in);
    System.out.println("Input a number to check if it's an Armstrong number");    
    n = in.nextInt();
 
    t = n;
    // Count number of digits

    while (t != 0) {
      digits++;
      t = t/10;
    }
 
    t = n;
 
    while (t != 0) {
      remainder = t%10;
      sum = sum + power(remainder, digits);
      t = t/10;
    }
 
    if (n == sum)
      System.out.println(n + " is an Armstrong number.");
    else
      System.out.println(n + " isn't an Armstrong number.");
  }

  static int power(int n, int r) {
    int c, p = 1;
 
    for (c = 1; c <= r; c++)
      p = p*n;
 
    return p;
  }
}