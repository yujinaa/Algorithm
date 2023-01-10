package baekjoon.단계별문제;

//11654	 아스키 코드
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.println((int)s.charAt(0));
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.next().charAt(0);
		System.out.println(n);
	}
}
//11720	 숫자의 합
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String a = input.next();
		int sum=0;
		for(int i = 0;i<n;i++) {

			sum+=a.charAt(i)-'0'; 
			//char를 int로 바꾸려면 아스키 코드를 사용한다.
			//charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
		}
		System.out.println(sum);
	}
