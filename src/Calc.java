
public class Calc {
	private Employee [] array;

	public Calc(Employee[] array) {
		this.array = array;
	}
	
	public void calc(int count) {
		for(int i = 0 ; i < count ; i++) {
			Employee employee = this.array[i];
			String sawonname = this.calcsawon(employee.getSawon());
			int ho = this.calcho(employee.getSawon());
			int ga = this.calcga(employee.getGajoksu());
			int salary = this.calcsalary(employee.getSalary());
			int ya = this.calcya(employee.getYa());
			
			int tot = ho + ga + salary + ya;
			
			double tax = ho - (ho % 10);
			double sil = tot - tax;

		}
	}
	
	private String calcsawon(String sawon) {
		return sawon;
	}
	
	private char calcho(String sawon) {
		switch(sawon.charAt(2)){
			case 1 : 
				return 900000;
				break;
			case 2 : 
				return 400000;
				break;
			case 3 : 
				return 600000;
				break;
			case 4 : 
				return 800000;
				break;
			case 5 : 
				return 300000;
				break;
			case 6 : 
				return 800000;
				break;
			case 7 : 
				return 800000;
				break;				
		}
	}
	
	private int calcga(int gajoksu) {
		return 7000*gajoksu; 
	}
	public int calcsalary(int salary) {
		switch(salary){
			case 1 :
				return 15000;
				
			case 2 :
				return 25000;
				
			case 3:
				return 35000;
				
			case 4:
				return 45000;
				
			default:
				break;
		}
	}
	public int calcya(int ya) {
		switch(ya){
			case 1:
				return 1500;
				
			case 2:
				return 2500;
				
			case 3:
				return 3500;
				
			case 4:
				return 4500;
				
		}
	}
}
