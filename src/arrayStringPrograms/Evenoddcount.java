package arrayStringPrograms;

public class Evenoddcount {
	public static void main(String[] args) {
		int a[]= {4,2,1,3,6,7,8,3,4,5,6,3,3,9,0,4,0,1,2};
		int even=0,odd=0,zero=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				zero++;
			}
			else if(a[i]%2==0) {
				even++;
			}
			else if(a[i]%2==1){
				odd++;
			}
		}
		System.out.println("Even elements count: "+even);
		System.out.println("Odd elements count: "+odd);
		System.out.println("Zero count: "+zero);
		
	}

}
