package baekjoon.단계별문제;
////10807.개수 세기
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr = new int[n];
		int cnt=0;
		for(int i =0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int v=input.nextInt();
		for(int i =0;i<arr.length;i++) {
			if(v==arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
//10871	 X보다 작은 수
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int x=input.nextInt();
		int[] a= new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = input.nextInt();
			if(a[i]<x) {
				System.out.print(a[i] + " ");
			}
		}
	}
}