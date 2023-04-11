package smartTechSolution.b34;

import javax.naming.Name;

public class Method1 {
	//return noting
	public void name(){
		 
	 }
	
	//return something
	public int age(){
		return 0;
		 
	 }
	 
	//return null
	public  String id(){
		return null;
		
	}
	//parametarized 
	public int salary(int x,int y){
		int total=x+y;
		return total;
		
	}
	
	
	public void amount(int salary, int bonous){
		System.out.println(salary+bonous); 
	}
	
	
    public static void  rent(String name){
    	
   System.out.println(name);
    	
    	 
     }
    
    
    
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method1.rent();
		System.out.println();
	
		
		 Method1.rent("mahin");
		
		Method1 obj = new Method1();
		obj.amount(10000,2000);
		
		
		
	}
	

}
