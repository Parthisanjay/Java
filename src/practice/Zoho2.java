package practice;

public class Zoho2 {
	public static void main(String[] args) {
			int n,x,count,i;
			n=68;
			for (x=1; x <= n; x++)
			   if(n%x==0){
			    for(count=0,i=1;i<=x;i++)
			    if(x%i==0)
			    count++;		    
			    if(count==2)
			    System.out.println(x);
			}
	}
}
