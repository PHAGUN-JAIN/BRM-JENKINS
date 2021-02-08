package fOReXPORT;
import java.util.Scanner;

public class mathAddSub {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers for addition");
		int a=in.nextInt();
		int b=in.nextInt();
		in.close();
		System.out.println("the sum of entered number is :"+sum(a,b));
	}
}
