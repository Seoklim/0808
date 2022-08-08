import java.util.Scanner;

public class Input1 {
	private Employee[] array;
	private Scanner sc;

	void input(Employee[] array) {
		this.array = array;
		this.sc = new Scanner(System.in);
	}

	void input() {
		String io = null;
		int count = 0;
		do {
			count++;
			System.out.print("사원번호 : ");
			String sawon = this.sc.nextLine();
			System.out.print("기본급 : ");
			int salary = this.sc.nextInt();
			System.out.print("야간시간 : ");
			int time = this.sc.nextInt();
			System.out.print("가족수 : ");
			int gajoksu = this.sc.nextInt();
			this.sc.nextLine();
			this.array[count - 1] = new Employee(sawon, salary, time, gajoksu);
			System.out.print("계속(I/O) ? : ");
			io = this.sc.next();
			this.sc.nextLine(); // buffer 날리기
		} while (io.equals("I") || io.equals("i"));
		return count;
	}

}
