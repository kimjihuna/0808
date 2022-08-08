/*
 * Method's Override 조건
 * 1. Method's Signature가 같은가?
 *  - 메소드의 필수 3요소 (이름,괄호,리턴타입)
 * 2. 접한 제한자(Access Modifier)의 관계
 *  - priavet<  package < protected  < pulbic
 * 
 */
public class OverrideDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();
		jasik.makeMoney();
	}
}
