import java.util.Scanner;
public class Example15 {
	private static Scanner sc;
	public static void main(String[] args){
		int i,n;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check :");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(n%i==0){
				c++;
			}
		}
		if(c==2){
		System.out.println(n+" is PRIME");
	    }
		else{
			System.out.println(n+" is not prime");
		}
	}
}


