package smartTechSolution.b34;

public class Method_paramitarized {
	
	
	//paramiterized return method
	public int getSalary(int x,int y){
		int total =(x+y);
		return total;
		
	}	
	
	//paramiterized void method
	//doing multiplication
	
	public void getEmployee (int rafi, int fahim) {
		//rafi =3000;
		//fahim= 5000;
		String company = "smart tech ";
		int tatalSalary=rafi+fahim;
		System.out.println(company + tatalSalary);
	}
	
	
	
	
	//satic void return paraameterized method
	
	public static void getEmployee2 (int rafi, int fahim) {
		//rafi =3000;
		//fahim= 5000;
		int tatalSalary2=rafi+fahim;
		System.out.println(tatalSalary2);
	}
	
		//for static return parameterized method
	 
	public static int getSalary1(int x,int y){
		int total2 =(x+y);
		return total2;
		
	}	
	//for static return parameterized method
	//using double
	 
	public static double getSalary3(double x,double y){
		double total3 =(x*y);
		return total3;
		
	}	
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for return
		Method_paramitarized obj = new Method_paramitarized();
		System.out.println("sumation of total salary by using return statement  " +obj.getSalary(100, 2000));

		
		//for void	
		Method_paramitarized obj1 = new Method_paramitarized(); 
		obj1.getEmployee(300, 440);
	
		
		
	    //static return parameterized
		System.out.println(Method_paramitarized.getSalary1(3000,3330));
	
		//satic void return paraameterized method
		
		
		Method_paramitarized.getEmployee2(35, 40);
		
		//for static return parameterized method using double 
		
		Method_paramitarized.getSalary3(2.00, 11.00);
		
	
	
	
	

	}

}
