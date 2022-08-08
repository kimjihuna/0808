/*
 * Polymorphism의 조건
 * 1. Method's Override 
 * 2. Object Cast
 *    1)Value Type
 *      a.자동형변환 (implicit convertion), promotion : 작은 쪽에서 큰걸로 변경 
 *    	 b.강제형변환 (explicit conversion), Demotion : 큰쪽에서 작은쪽으로 변경 , () 연산자를 사용
 *    2) Objecct Type
 *      a.자동형변환 (implicit convertion), promotion : 자식에서 부모로 형변환은 항상 된다.
 *      b.강제형변환 (explicit conversion), Demotion : 부모에서 자식의 형변환은 강제적 형변환만 가능하며, 될 대도 있고 ,안될 때도 있다.
 */
public class PolymorphismDemo {
	public static void main(String[] args) {
//		Test t = new Test();
//		Demo d = new Demo();
//		if (t instanceof Demo) {
//			d = (Demo) t;
//		} else {
//			System.out.println("형변환 불가능");
//		}
//		Demo d = new Test();
		Test t = new Demo();
	}
}

class Test {
} // 부모

class Demo extends Test {
} // 자식
