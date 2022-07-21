package print1;
import java.util.Scanner;


public class string_print {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Words to Print");
		word = s.next();
		System.out.println(""+word);
		s.close();
		}
}
