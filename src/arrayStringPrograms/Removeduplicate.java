package arrayStringPrograms;

import java.util.Arrays;

public class Removeduplicate {
public static void main(String[] args) {
	int a[]={-1,2,4,5,2,4,7};
	for(int i=0;i<a.length;i++)
	{
	  for(int j=i+1;j<a.length;j++)
	  {
		  if(a[i]==a[j])
		  {
           a[i]=0;
           a[j]=0;
		  }
	  }
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			System.out.print(a[i]+" ");
		}
	}
//	System.out.println(Arrays.toString(a));
}
}
