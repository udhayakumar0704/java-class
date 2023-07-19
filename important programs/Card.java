package card;

import java.util.Scanner;

public class Cardgame {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char x,y,z;
	int a,b,c;
	x=sc.next().charAt(0);
	a=sc.nextInt();
	y=sc.next().charAt(0);
	b=sc.nextInt();
	z=sc.next().charAt(0);
	c=sc.nextInt();
	if(((x==y)&&(x==z))&&((a==b)&&(a==c)))//a=s,b=s,c=s;x=2,y=2,z=2
{
	System.out.println("Double Bonanza");
}
else if(((x==y)&&(x==z))||((a==b)&&(a==c)))
{
	System.out.println("Bonanza");
}
else
{
	System.out.println("No Bonanza");
}

}
}