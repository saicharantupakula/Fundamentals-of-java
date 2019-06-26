import java.util.Scanner;
public class Example10 {
	private static Scanner sc;

	public static void main(String[] args){
		char ch1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter charector :");
		ch1=sc.next().charAt(0);
		if(Character.isUpperCase(ch1)){
			System.out.println(Character.toLowerCase(ch1));
		}
		else{
			System.out.println(Character.toUpperCase(ch1));
			
		}
		
	}

}
