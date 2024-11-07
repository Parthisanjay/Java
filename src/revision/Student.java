package revision;

public class Student {
	String sname;
	int sid;
	
	Student(String sname,int sid){
		this.sname=sname;
		this.sid=sid;
	}
	
	public boolean equals(Object o) {
		Student s=(Student)o;
		if(this.sname.equals(s.sname) && this.sid==s.sid) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Student s1=new Student("John",12);
		Student s2=new Student("John",12);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
