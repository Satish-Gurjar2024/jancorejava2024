
public class ProductOfDigits {

	public static void main(String[] args) {

		int n=1543;
		int r=1;
		int t=0;
		
		while(n>0) {
			
			t=n%10;
			r=r*t;
			n=n/10;
			
		}
		System.out.println(r);
	}

}
