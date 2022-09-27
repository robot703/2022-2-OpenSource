package Chapter3PrecticeProblom;

import java.util.Scanner;

public class Number8 {	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 몇개?(1~99): ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		for (int i=0; i<n;i++) {
			arr[i] = (int)(Math.random()*100+1);

			for(int j = 0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}

			}
		}

		for(int i=0;i<n;i++) {
			if(i%10==9) { 
				System.out.print(arr[i]+" ");
				System.out.println();
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
	}

}