import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Scanner sc;
	public static FileReader fr;
	public static ArrayList<Monkey> monkeysAL = new ArrayList<>();
	
	
	public static void main(String[] args) {
		try {
			fr = new FileReader("testMonkeys.txt");
			sc = new Scanner(fr);
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
		}
		while (sc.hasNext()) {
			monkeysAL.add(new Monkey(10));
			sc.nextLine();
			sc.nextLine();
			sc.nextLine();
			sc.nextLine();
			sc.nextLine();
			sc.nextLine();
			sc.nextLine();
		}
		
		for (Monkey monkey : monkeysAL) {
			System.out.println(monkey);
		}
	}

}
