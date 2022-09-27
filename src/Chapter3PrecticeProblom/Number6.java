package Chapter3PrecticeProblom;

import java.util.Scanner;

public class Number6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int unit[] = {50000,10000,1000,100,10,1};
		
		System.out.print("금액을 입력하시오>>");
		int money=sc.nextInt();
		
		for(int i=0;i<unit.length;i++) {
			System.out.print(unit[i]+"원 짜리 : "+money/unit[i]+"개 "+"\n");
			money-=(money/unit[i])*unit[i];
		}

	}

}
