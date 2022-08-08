import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Student[] array;
	private Scanner sc;
	private File file;

	// Constructor == 멤버변수 초기화
	public Input(Student[] array, String path) {
		this.array = array;
		this.file = new File(path);
		try {
			this.sc = new Scanner(this.file, "utf-8");
			System.out.println("File founded");
		} catch (FileNotFoundException e) {
			System.out.println("fiile not found");
		}
	}

	public void fileInput() {
		for (int i = 0; i < array.length; i++) {
			String line = this.sc.nextLine();
//			String[] values = line.split("\\s+");
//			System.out.println(values[1]);
			Scanner myScanner = new Scanner(line);
			myScanner.useDelimiter("\\s+");
			this.array[i] = new Student(myScanner.next(), myScanner.next(), myScanner.nextInt(), myScanner.nextInt(),
					myScanner.nextInt(), myScanner.nextInt());
		}
	}

}
