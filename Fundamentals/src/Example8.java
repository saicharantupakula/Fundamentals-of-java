import java.util.Scanner;
public class Example8 {
	private static Scanner sc;

	public static void main(String[] args) {
		char ch;
		sc = new Scanner(System.in);
		System.out.println("enter something :");
		ch=sc.next().charAt(0);
		if((ch >='A' && ch <='Z')|| (ch >='a' && ch<='z')){
			System.out.println("Alphabhet");
		}
		else if(ch >=32 && ch <=47) {
			System.out.println("Symbol");
		}
		else{
			System.out.println("Digit");
		}
	}

}
