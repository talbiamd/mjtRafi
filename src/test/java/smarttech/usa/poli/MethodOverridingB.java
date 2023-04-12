package smarttech.usa.poli;

public class MethodOverridingB extends MethodOveridingA{
	public void getArt1() {
		System.out.println("SHANTO is not a good artist");
	}
	public void getSalary() {
		System.out.println("his current salary is 110000");
		
	}
	public static void main(String[] args) {
		MethodOverridingB obj =new MethodOverridingB();
		obj.getArt();
		obj.getSalary();
		obj.getArt1();
}
	
	
}
