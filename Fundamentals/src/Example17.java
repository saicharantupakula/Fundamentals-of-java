import java.util.Scanner;
public class Example17 {
	public static void main(String[] args){
		int i,n;
		int c=0;
		Scanner s=new Scanner(System.in);
	    n=s.nextInt();
		if(n==0 || n==1){
			System.out.println(n+" neither prime nor composite");
		}
		else{
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
}