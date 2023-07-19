package statement;

import java.util.Scanner;
public class Decision2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int mark=s.nextInt();
		if(mark>=85)//condition 1
		{
			System.out.println("A");
		}
		else if(mark>=75)
		{
			System.out.println("B");
		}
		else if(mark>=65)
		{
			System.out.println("C");
		}
		else if(mark>=50)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
