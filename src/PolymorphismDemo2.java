import java.util.Scanner;

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		String y_n = null;
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			int choice = input(sc);
			output(choice);
			System.out.println("Again(y/n) ? :");
			y_n = sc.next();
		} while (y_n.equals("y") || y_n.equals("Y"));
	}

	static void showMenu() {
		System.out.println("**********menu**********");
		System.out.println("1.Lino");
		System.out.println("2.Cat");
		System.out.println("3.Dog");
		System.out.println("4.Korean");
		System.out.println("5.American");
	}

	static int input(Scanner mySc) {
		System.out.println("당신은 어느 종족이십니까 ? (1w...................................................................................................~5) ");
		return mySc.nextInt();
	}

	static void output(int choice) {
		Mammal m = null;
		switch (choice) {
		case 1:
			m = new Lion();
			break;
		case 2:
			m = new Cat();
			break;
		case 3:
			m = new Dog();
			break;
		case 4:
			m = new Korean();
			break;
		case 5:
			m = new American();
			break;
		default:
			System.out.println("잘못된 번호입니다.");
			return;
		}
		m.saySmoething();
	}

}
