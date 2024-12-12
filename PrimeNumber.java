import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the integer:");
		int n=sc.nextInt();
		boolean flag=false;
		
		if(n==0||n==1) {
			flag = true;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println(n+" is prime number");
		}else {
			System.out.println(n+" is not prime number");
		}
		sc.close();
	}

}
