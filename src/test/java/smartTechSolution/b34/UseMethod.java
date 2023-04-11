package smartTechSolution.b34;

public class UseMethod {
	
	public void getSelary() {
		String name="rafi";
		int salary =20000;
		int bonus= 5000;
		int total= salary+bonus;
		System.out.println(name +" salary is : "+ total);
	}

	public int grtbonus(){
		String name1= "rafi";
		int salary =20000;
		int bonus= 5000;
		int total1= salary+bonus;
		return total1;
		
	}
	public void grtbonus1(int shanto,int imran){
		String name1= "rafi";
	    //shanto=10;
		//imran=20;
		int total2= shanto+imran;
		System.out.println(total2);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UseMethod objName = new UseMethod();
		//objName.getSelary();
		
		
		//UseMethod obj1 = new UseMethod();
		//obj1.grtbonus();
		//System.out.println(obj1.grtbonus());
		
		
		
		UseMethod obj2 = new UseMethod();
		obj2.grtbonus1(200, 300);
		
		
		
		
		
		
		
		
		
		
	}

	
	
		
	
}
