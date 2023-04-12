package smarttech.usa.poli;

	public class MethodOverloading {
	
	
	public void getname(String name) {
		
		System.out.println(name);
	}
	
    public void getname(String name, int salary) {
		
    	System.out.println(name+salary);
	}
    
    public void getname(int bonus) {
    	
    	System.out.println(bonus);
	}
    
    public void getdollar(double dollar) {
	
    	System.out.println(dollar);
    }
    
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.getdollar(12000);
		obj.getname("Rafi");
		
		
		
		
		}

}
