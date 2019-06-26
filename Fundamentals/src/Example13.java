import java.util.Scanner;

public class Example13 {
	private static Scanner sc;

	public static void main(String[]args) {	
	int n,i;
	sc = new Scanner(System.in);
	System.out.println("enter number :");
	n=sc.nextInt();
	for(i=1;i<=n;i++){
		System.out.print(i+" ");
	}
	}
}
