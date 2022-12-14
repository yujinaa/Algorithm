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

	//	14681.사분면 고르기
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int x= input.nextInt();
			int y= input.nextInt();
			if(x>0 && y>0) {
				System.out.println("1");
			}else if(x<0 && y>0) {
				System.out.println("2");
			}else if(x<0 && y<0) {
				System.out.println("3");
			}else {
				System.out.println("4");
			}
		}
	}
	//2884.알람 시계
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int h= input.nextInt();
			int m= input.nextInt();
			if(m<45) {
				h--;
				m= 60-(45-m);
				if(h<0) {
					h=23;
				}
				System.out.print(h+" "+m);
			}else {
				System.out.print(h+" "+(m-45));
			}
		}
	}
	//2525.오븐시계
	import java.util.Scanner;
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int a= input.nextInt();
			int b= input.nextInt();
			int c = input.nextInt();

			int m = 60 * a+b;   // 시 -> 분
			m += c;

			a = (m / 60) % 24;
			b = m % 60;

			System.out.println(a + " " + b);

		}
	}
	//	2480.주사위 세개
	//	같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
	//	같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
	//	모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
	import java.util.Scanner;
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int a= input.nextInt();
			int b= input.nextInt();
			int c = input.nextInt();

			if(a==b && b==c && a==c) {
				System.out.println(10000 + (a*1000));

			}else if(a==b || a==c) {
				System.out.println(1000+(a*100));
			}else if(b==c){
				System.out.println(1000+(b*100));
			}else {
				System.out.println(Math.max(a, Math.max(b, c))*100);
			}
		}
	}

	//주사위 다른 풀이
	import java.util.Scanner;
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int a= input.nextInt();
			int b= input.nextInt();
			int c = input.nextInt();

			if(a==b && a==c) {
				System.out.println(10000 + (a*1000));

			}else if(a==b&&a!=c || a==c&&a!=b) {
				System.out.println(1000+(a*100));
			}else if(b==c&&b!=a){
				System.out.println(1000+(b*100));
			}else {
				int max=a;
				if(max<b)
					max=b;
				if(max<c)
					max=c;
				System.out.println(max*100);
			}
		}
	}



}