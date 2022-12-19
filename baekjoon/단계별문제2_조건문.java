package baekjoon.단계별문제;
import java.util.Scanner;

public class 단계별문제2_조건문 {
	
	//1330.두 수 비교하기
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int a= input.nextInt();
			int b= input.nextInt();
			if(a>b) {
				System.out.println(">");
			}else if(a<b) {
				System.out.println("<");
			}else {
				System.out.println("==");
			}
		}
	}
	
	

}

}
