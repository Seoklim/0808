//Polymorphism의 조건
//1. Method's Override
//2.객체 형변환
//1)value type
//a.자동 형변환 : 작은쪽에서 큰쪽으로 바꾸는것 Cast Up
//b.강제 형변환 : 큰쪽에서 작은쪽으로 바꾸는것 Cast Down
//2)object type
//a.자동 형변환
//b.강제 형변환
public class PolymorphismDemo {
	public static void main(String[] args) {
		//Test t = new Test();
		//Demo d = new Demo();
		Test t = new Demo();//자식->부모형변환가능 > 자식은 부모님의 주소를받을수있다.
//		if(t instanceof Demo) {
//		d = (Demo)t; 
//		}else {
//			System.out.println("형변환 불가능");
//		}
	}
}
//자식은 부모로 (자동,강제)항상 형변환이된다
//부모 -> 자식 (강제적형변환만가능), 하지만 될때도있고 안될때도 있다.
class Test{}  //부모
class Demo extends Test{} //자식
