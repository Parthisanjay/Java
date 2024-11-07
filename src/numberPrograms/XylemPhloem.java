package numberPrograms;

import java.util.*;
public class  XylemPhloem
{
	static int length;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int m=s.nextInt();
		length=length(m);
		int num=m;
		int rem=0;
		int ext=0;
		int mean=0;
		for(int i=1;i<=length;i++)
		{
			rem=num%10;
			if(i==1 || i==length)
			{
				ext=ext+rem;
			}
			else
			{
				mean=mean+rem;
			}
			num=num/10;
		}
		if(ext==mean)
		{
			System.out.println("The Entered Number is Xylem");}
		else
		{
			System.out.println("The Entered Number is Phloem");}			
	}
	public static int length(int m)
	{
		int count=0;
		while(m!=0)
		{
			m=m/10;
			count++;
		}
		return count;
	}
}
