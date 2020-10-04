import java.io.*;
class StrongNumber{
	public static  int fact(int number){
		int f = 1;
		while(number != 0)
		{
			f =f * number;
			number--;
		}
		return f;
	}
	public static void main(String[] args) {
		int before, after;
		Console c = System.console();
		System.out.println("Enter a number:");
		int n = Integer.parseInt(c.readLine());
		before = n;
		after = 0;

		while(n!=0){
			n = n % 10;
			after =after + fact(n);
			n = n / 10;
		}
		if(after == before){
			System.out.println("Strong Number");
		}
		else{
			System.out.println("Not a Strong Number");
		}
	}
}