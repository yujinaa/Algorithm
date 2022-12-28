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
//8393.	합
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); 
		int sum=0;
		for (int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
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
		int X = input.nextInt();
		int N = input.nextInt(); 


		for (int i=0; i<N; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			X = X-a*b;
		}

		if (X == 0) System.out.println("Yes");
		else System.out.println("No");
	}    
}
//15552.	빠른 A+B
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		bw.flush();
	}
}

//빠른 a+b 다른 풀이
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		for(int i = 0; i < n; i++){
			String s = bf.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			bw.write(a+b+"\n");
		}
		bw.flush();
	}
}
//11021	A+B - 7
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i=1; i<=t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			System.out.println("Case #"+i +": "+(a+b));
		}
	}    
}
//11022.	A+B - 8
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
      
      for (int i=1; i<=t; i++) {
          int a = input.nextInt();
          int b = input.nextInt();
          
          System.out.println("Case #"+i +": " + a + " + " + b +  " = " + (a+b));
      }
  }    
}
//2438.	별 찍기 - 1
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
      
      for (int i=1; i<=n; i++) {
      	for(int j=0;j<i;j++) {
      		System.out.print("*");
      	}
      	System.out.println();
      }
  }    
}