
public class PolymorphismDemo4 {
	public static void main(String[] args) {
		Mammal[] array = new Mammal[5];
		array[0] = new Lion();
		array[1] = new Cat();
		array[2] = new Dog();
		array[3] = new Korean();
		array[4] = new American();
		for (Mammal m : array) {
			m.saySmoething();
		}
		Car[] cars = { new Sonata("BlackSonata"), new Carnival("Whitecaasdf"), new Matiz("red ma") };
		for (Car car : cars) {
			System.out.println(car.getName() + "이가 잘 수리됐습니다");
		}

	}
}
