
public class Employee {
	private String sawon, sawonname, buseo;
	private int salary;
	private int time;
	private int gajoksu;
	private int ho,ga,ya,tot;
	private double tax, sil;
//	public Employee() {}
	public Employee(String sawon, int salary, int time, int gajoksu) {
		this.sawon = sawon;
		this.salary = salary;
		this.time = time;
		this.gajoksu = gajoksu;
	}
	public String getSawon() {
		return sawon;
	}
	public void setSawon(String sawon) {
		this.sawon = sawon;
	}
	public String getSawonname() {
		return sawonname;
	}
	public void setSawonname(String sawonname) {
		this.sawonname = sawonname;
	}
	public String getBuseo() {
		return buseo;
	}
	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getGajoksu() {
		return gajoksu;
	}
	public void setGajoksu(int gajoksu) {
		this.gajoksu = gajoksu;
	}
	public int getHo() {
		return ho;
	}
	public void setHo(int ho) {
		this.ho = ho;
	}
	public int getGa() {
		return ga;
	}
	public void setGa(int ga) {
		this.ga = ga;
	}
	public int getYa() {
		return ya;
	}
	public void setYa(int ya) {
		this.ya = ya;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getSil() {
		return sil;
	}
	public void setSil(double sil) {
		this.sil = sil;
	}
	
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return String.format(
				"Employee [sawon=%s, sawonname=%s, buseo=%s, salary=%s, time=%s, gajoksu=%s, ho=%s, ga=%s, ya=%s, tot=%s, sil=%s]",
				sawon, sawonname, buseo, salary, time, gajoksu, ho, ga, ya, tot, sil);
	}
	
}
