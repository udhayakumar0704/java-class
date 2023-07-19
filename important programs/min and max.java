package min;

import java.util.Scanner;

public class Minimum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int min=0;
		if(a<b)
		{
			min=a;
		}
		else
		{
			min=b;
		}
		System.out.println(min+" ");
		System.out.println(a+b);
		
		
		
	}

}
