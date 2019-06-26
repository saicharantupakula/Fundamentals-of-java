import java.util.Scanner;
public class Example11 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		char ch1;
		System.out.println("\nR\nB\nG\nO\nY\nW");
		System.out.println("enter colour code given :" );
		ch1=sc.next().charAt(0);
		switch(ch1){
		case 'R' :System.out.println("Red");
		          break;
		case 'B' :System.out.println("Blue");
                  break;
		case 'G' :System.out.println("Green");
                  break;
		case 'O' :System.out.println("Orange");
                  break;
		case 'Y' :System.out.println("Yellow");
                  break;
        case 'W' :System.out.println("White");
                  break;
        default :System.out.println("Invalid Code");
                  break;
		}
	}
}
