import java.util.Scanner;

public class RomanNum_Conversion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str = sc.nextLine();
	int ans = 0, num = 0;
    for (int i = str.length()-1; i >= 0; i--) {
        switch(str.charAt(i)) {
            case 'I': num = 1; break;
            case 'V': num = 5; break;
            case 'X': num = 10; break;
            case 'L': num = 50; break;
            case 'C': num = 100; break;
            case 'D': num = 500; break;
            case 'M': num = 1000; break;
        }
        if (4 * num < ans) { 
        	ans -= num;
        }
         else ans += num;
    }
    System.out.println(ans);
    sc.close();
}
}