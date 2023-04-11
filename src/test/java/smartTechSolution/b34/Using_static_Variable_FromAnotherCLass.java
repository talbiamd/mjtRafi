package smartTechSolution.b34;

public class Using_static_Variable_FromAnotherCLass {

	String detailRequirment;//using instance variable
	
	public void employeeDetail() {
		
		detailRequirment= "total salary with information : ";
		Declear_ststicVariable.age = 35; 
		Declear_ststicVariable.employeeName="M.Rafi";
		Declear_ststicVariable.bonus=3500;
		Declear_ststicVariable.salary=12000;
		
		int pbonus=200;
		int total=Declear_ststicVariable.bonus+Declear_ststicVariable.salary+ pbonus;
	
	
	System.out.println(detailRequirment+total+" salary." );
	System.out.println("AGE :" +Declear_ststicVariable.age +"Name :"+ Declear_ststicVariable.employeeName);
	
	
	}
	
	public static void employeeDetail1() {
		
		String detailinfo= "using static void method by call static variable from another class : ";
		Declear_ststicVariable.age = 35; 
		Declear_ststicVariable.employeeName="M.emran";
		Declear_ststicVariable.bonus=3000;
		Declear_ststicVariable.salary=12000;
		
		int pbonus=250;
		int total=Declear_ststicVariable.bonus+Declear_ststicVariable.salary+ pbonus;
	
	
	System.out.println(detailinfo+total+" salary." );
	
	
	System.out.println("AGE :" +Declear_ststicVariable.age +"Name :"+ Declear_ststicVariable.employeeName);
	
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Using_static_Variable_FromAnotherCLass obj = new Using_static_Variable_FromAnotherCLass();
		obj.employeeDetail();
		
		
		Using_static_Variable_FromAnotherCLass.employeeDetail1();
		
	}

}
