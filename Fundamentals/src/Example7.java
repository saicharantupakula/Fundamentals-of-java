import java.util.Scanner;
public class Example7 {
	private static Scanner sc;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char p,q;
		System.out.println(" enter 2 charectors :");
	    p=sc.next().charAt(0);
		q=sc.next().charAt(0);
		if(p > q ){
			System.out.println(p+","+q);
		}
		else {
		System.out.println(q+","+p);
		}
	}
}

