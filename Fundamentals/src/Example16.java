public class Example16 {
	public static void main(String[] args){
		int i,n;
		int c=0;
		for(n=10;n<=99;n++){
		for(i=1;i<=n;i++) {
			if(n%i==0){
				c++;
			}
		}
		if(c==2){
		System.out.println(n);
		c=0;
	    }
		}
	   }
	}
