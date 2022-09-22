package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the number ");
		int n = in.nextInt();
		
		boolean[] ar = new boolean[n+1];		
		for (int i =0; i <= n; i++) {
			ar[i]=true;
		}
		
		for(int i =2; i< Math.pow(n, 0.5); i++) {
			if(ar[i]) {
				for(int j = i*i; j <= n; j +=i) {
					ar[j] = false;
				}
			}
		}
		
		for(int i =2; i<= n; i++) {
			if(ar[i]) {
				System.out.println(i+ " ");
			}
		}
		
		
		
		
	}

}
