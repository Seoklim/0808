//메소드의 @override의 조건
//1.메소드의 시그니쳐가 같은가?
//-메소드의 필수 3요소(이름, 괄호, 리턴타입)
//2.접근제한자(Access Modifier)의 관계
//-private < package < protected < public
//부모메소드가 package 이면 자식이 public이면 괜찮은데
//부모메소드가 public인데 자식이 package이면안됨
public class OverrideDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();
		jasik.MakeMoney();
	}
}
