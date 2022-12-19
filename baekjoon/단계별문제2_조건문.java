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
	//9498.시험 성적
	//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int a= input.nextInt();
			if(a>=90) {
				System.out.println("A");
			}else if(a>=80) {
				System.out.println("B");
			}else if(a>=70) {
				System.out.println("C");
			}else if(a>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
	}
	//2753.윤년
	//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int year= input.nextInt();
			if(year%4==0 && (year%100!=0 || year%400==0)) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
			
		}
	}

}

}
