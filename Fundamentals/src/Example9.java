import java.util.Scanner;
public class Example9 {
		public static void main(String[] args)
		{	
			String Gender;
	        	int age;
	        	Scanner c=new Scanner(System.in);
	        	Gender=c.nextLine();
	        	age=c.nextInt();
	        	if(args.length==0)
	        	{
	            		System.out.println("Empty Arguments");
	        	}  
	        	else
			{
	            		if(Gender.equals("Male") || Gender.equals("Female") || Gender.equals("male") || Gender.equals("female"))
	            		{
	                		if(age>1 && age<=100)
	                		{
	                    			if ((Gender.equals("Female") || Gender.equals("female")) && (age >= 1 && age <= 58)) 
						{
	                        			System.out.println("Interest is 8.2%");
	                    			}
			 			else if ((Gender.equals("Female") || Gender.equals("female")) && (age >= 59 && age <= 100)) 
						{
	                        			System.out.println("Interest is 9.2%");
	                    			} 
						else if ((Gender.equals("Male") || Gender.equals("male")) && (age >= 1 && age <= 58)) 
						{
	                        			System.out.println("Interest is 8.4%");
	                    			} 
						else if ((Gender.equals("Male") || Gender.equals("male")) && (age >= 59 && age <= 100)) 
						{
	                        			System.out.println("Interest is 10.5%");
	                    			}
	                		}
	            		}
	        	}

		}
}