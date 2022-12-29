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
//10818	 최소, 최대
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr= new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);//sort를 사용하면 배열을 작은값부터 정렬한다.
		System.out.println(arr[0]+" "+arr[n-1]);//배열의 0번쨰 값은 최소값이고 배열길이에서 -1을하면 최댓값이된다.
	}
}