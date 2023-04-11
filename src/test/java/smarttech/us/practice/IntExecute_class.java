package smarttech.us.practice;

public class IntExecute_class  implements Interface_practice1,Interface_practice2{

	public void getPayment() {
		
		System.out.println("who need my property");
	}

	public void getPayment1() {
		
		System.out.println("i love my daughter");
	}
	
	
	
	public static void main(String[] args) {
		
		IntExecute_class obj = new IntExecute_class();
		obj.getPayment();
		obj.getPayment1();
		
	}
	
}
