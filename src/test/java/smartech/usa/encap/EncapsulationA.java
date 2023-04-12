package smartech.usa.encap;

public class EncapsulationA {
	private String jobtitle = "Qa Tester";
	private int salary =100000;
	private  String getJobtitle() {
		return jobtitle;
	}
	private int getSalary() {
		return salary;
	}
	
		public static void main(String[] args) {
			EncapsulationA obj =new EncapsulationA();
			//obj.getSalary();
			//obj.getJobtitle();
			System.out.println(obj.getSalary());
			System.out.println(obj.getJobtitle());
		}
		
}
