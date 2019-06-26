import java.util.Scanner;

public class Example19 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n;
		int i,j;
		System.out.println("enter n :");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
