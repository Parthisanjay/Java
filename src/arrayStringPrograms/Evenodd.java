package arrayStringPrograms;

public class Evenodd {
	public static void main(String[] args) {
		int a[]= {2,3,1,4,7,5,8};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Even number:"+a[i]);
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.println("Odd number: "+a[i]);
			}
		}
	}

}
