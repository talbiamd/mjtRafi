package smartTechSolution.b34;



public class VariabaleTest {

	static String name;    // static variable
	
	static int salary;     // static variable
	static int bonus;      // static variable
	
			int x;//instance variable
			int y;//instance variable
	
	//static return parameterized
	public static int getSalary(int salary,int bonus){
		int total =(salary+bonus);
		return total;
		
	}	
	//static return using string datatype
	public static  String getinfo() {
		name ="rafi :";
		bonus=200;
		salary=5000;
	
		int total =( salary+bonus);
		return name + total;
	}
	
	//using instance variable void method
	
	public  void getSalary() {
		x=10;
		y=20;
		int total =  x*y;
		System.out.println(total);
	}
	//using static variable void method
	public static  void getinfo1() {
		name ="rafi :";
		bonus=2000;
		salary=5000;
	
		int total =( salary+bonus);
		System.out.println(name + total);
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(VariabaleTest.getSalary(3200,300));
		
		
		System.out.println( VariabaleTest.getinfo());
		
		
		
		
		
		VariabaleTest obj2 = new VariabaleTest();
		obj2.getSalary();
		
		
		
		VariabaleTest.getinfo1();
		
		
		
		
		
		
	}

}
