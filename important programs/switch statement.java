package switc;

import java.util.Scanner;

public class Decision4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char grade = sc.next().charAt(0);
	switch(grade)
	{
	case 'A':
		System.out.println("Excellent");
	    break;
	case 'B':
		System.out.println("Well Done");
		break;
	case 'C':
	    System.out.println("You Passed");
	    break;
	case 'D':
	    System.out.println("Udhaya smart");
	    break;
	    default:
	      System.out.println("THANK YOU MY LORD");
	}

	}

}
