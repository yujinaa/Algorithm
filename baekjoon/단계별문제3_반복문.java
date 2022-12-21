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
