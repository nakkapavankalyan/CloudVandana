import java.util.Scanner;
import java.util.TreeSet;

public class Panagram_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		TreeSet<Character> tr = new TreeSet<Character>();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != ' ') {
				char ch = Character.toLowerCase(str.charAt(i));
				tr.add(ch);
			}
		}
		if (tr.size() == 26) {
			System.out.println("The Given Sentence is panagram.....");
		} else
			System.out.println("The Given Sentence is not panagram...");
		sc.close();
	}
}
