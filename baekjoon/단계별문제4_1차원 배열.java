package baekjoon.단계별문제;
////10807.개수 세기
//30번까지 들어갈 수 있는 배열을 만들고, 
//28개의 번호를 입력받아 반복문을 통해 배열에 담아
//30번까지 체크를하여 2명의 미제출한 학생 번호를 출력한다. 
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
//2562	 최댓값
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int[] arr= new int[9];
		int max=0;
		int index=0;
		for(int i = 0;i<9;i++) {
			arr[i] = input.nextInt();
			if(arr[i]>max) {
				max=arr[i];
				index =i+1; //인덱스 번호가 아니라 몇번째 수인지 구하라고 하기때문에 인덱스 번호보다 +1을 해준다.
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
//5597	 과제 안 내신 분..?
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int[] arr = new int[31];
		for(int i =1;i<=28;i++) {
			arr[input.nextInt()]++;
		}
		for(int i =1;i<=30;i++) {
			if(arr[i]==0) {
				System.out.println(i);
				
			}
		}
	}
}
//3052	 나머지
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int[] arr = new int[10];
		int count=0;
		for(int i =0;i<10;i++) {
			arr[i]=input.nextInt()%42;
		}

		for(int i =0;i<10;i++) {
			int temp=0;
			for(int j=i+1;j<10;j++) {
				if(arr[i]==arr[j])
					temp++;
			}
			if(temp==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
//1546	 평균
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		int max=0;
		double avg=0;
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]= input.nextInt();
			if(arr[i]>max) {
				max= arr[i];
			}
			avg+=arr[i];
		}
		System.out.println(avg/max*100/n);

	}
}
//1546	 평균 다른 풀이
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		int max=0;
		double avg=0;
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]= input.nextInt();
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		for(int i =0;i<n;i++) {
			avg+=arr[i];
		}
		System.out.println(avg/max*100/n);

	}
}
//8958	 OX퀴즈
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		String[] arr = new String[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=input.next();
		}

		for(int i =0;i<arr.length;i++) {
			int score=0;
			int sum=0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j) == 'O') {
					score++;
					sum+=score;
				} else
					score=0;
			}
			System.out.println(sum);
		}
	}
}
//4344	 평균은 넘겠지
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		int c=input.nextInt();//케이스수
		int[] arr;

		for(int i =0;i<c;i++) {
			int n = input.nextInt();//학생수
			arr = new int[n];
			int sum=0;

			for(int j=0;j<n;j++) {
				int score=input.nextInt();
				arr[j] = score;
				sum +=score;
			}
			double avg= sum/n;
			double count=0;

			for(int j = 0;j<n;j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", count / n * 100);
		}
	}
}