package baekjoon.단계별문제;

//2739.구구단
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		for(int i =1;i<=9;i++) {
				System.out.println(n + " * " + i + " = " + n*i);

		}
	}
}
//구구단 다른 풀이(이중 반복문)
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		for(int i;i<=n;i++) {
			for(int j =1;j<=9;j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}

		}
	}
}

//10950.A+B - 3
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int t= input.nextInt();
		for(int i =1;i<=t;i++) {
			int a= input.nextInt();
			int b= input.nextInt();
			System.out.println(a+b);
		}
	}
}
//25304.	영수증
//첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
//이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x= input.nextInt();
		int n= input.nextInt();
		int sum=0;
		for(int i =1;i<=n;i++) {
			int a= input.nextInt();
			int b= input.nextInt();

			sum += a*b;
		}
		if(sum==x) 
			System.out.println("yes");
		else 
			System.out.println("no");
	}
}

