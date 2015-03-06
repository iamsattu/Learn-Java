
 class Emp {
	String name;
	int age;
	Emp(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class StringImmutable{
	public static void main(String args[]){
		Emp e = new Emp("Satish", 28);
		
		System.out.println("Emp :"+e);
	}
}
