package baekjoon.단계별문제;

//2739.구구단
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		for(int i =2;i<=n;i++) {
			for(int j =1;j<=9;j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}

		}
	}
}