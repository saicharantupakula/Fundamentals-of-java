import java.util.Scanner;

public class Example18{
		private static Scanner sc;
		public static void main(String[] args){
			long sum=0;
			long num; 
			sc=new Scanner(System.in);
			System.out.println("enter number :");
			num=sc.nextLong();
			for(;num!=0;){
				sum=sum+(num%10);
				num=num/10;
			}
			System.out.println(sum);
		}

	}
