
public class SalaryManagement {
	public static void main(String[] args) {
		Employee employee = new Employee[10];
		
		Input1 input = new Input1(employee);
		int count = input.input();
		
		Calc calc = new Calc(employee);
		calc.calc(count);

		Output1 output = new Output1();
		output.output();
	}
}
