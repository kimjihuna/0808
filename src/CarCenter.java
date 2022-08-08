
public class CarCenter {
	public static void main(String[] args) {
//		Sonata sonata = new Sonata("Black Sonata");
//		repair(sonata);
		
		Carnival carnival = new Carnival("White carnival");
		repair(carnival);
		
//		Matiz matiz= new Matiz("red matiz");
//		repair(matiz);
	}
	
	
	static void repair(Car car){
		if(car instanceof Sonata) {
			System.out.println("소나타가 잘 수리 됐습니다.");
		}else if(car instanceof Carnival) {
			System.out.println("ㅋ나비발이 잘수리 ");
		}else if(car instanceof Matiz) {
			System.out.println("마티즈가 잘 수리 ");
		}
//		System.out.println(car.getName()+"이(가) 잘 수리됐습니다.");
	}
}
