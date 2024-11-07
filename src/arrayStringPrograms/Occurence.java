package arrayStringPrograms;

public class Occurence {
	public static void main(String[] args) {
		int a[]={2,4,1,8,5,4,2,3,7,1,3,2};
		occCheck(a);
	}
	
	public static void occCheck(int a[]) {

		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			System.out.println("Element "+a[i]+" Count "+count);
		}
	}

}
