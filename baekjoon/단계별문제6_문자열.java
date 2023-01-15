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
	//10809	 알파벳 찾기
	import java.util.Scanner;
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			String a = input.next();
	        for (char c = 'a' ; c <= 'z' ; c++) {
//	        	indexOf()는 특정 문자의 위치를 반환하며, 존재하지 않을 경우 -1을 반환하는 메서드
	        	System.out.print(a.indexOf(c) + " ");
	    }
		}
	}
	//2675	 문자열 반복
	import java.util.Scanner;
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int s = input.nextInt();
			for(int i = 0; i < s; i++) {
				int count = input.nextInt();
				String str = input.next();
				
				for(int j = 0; j < str.length(); j++) {  
					for(int k = 0; k < count; k++) {
						System.out.print(str.charAt(j));
					}
				}
	            
				System.out.println();
			}
		}
	}
	//1157	 단어 공부
	import java.util.Scanner;
	public class Main {
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine().toUpperCase();

			int[] cnt = new int[26];
			int max = 0;
			char result = '?';

			for (int i = 0; i < str.length(); i++) {
				cnt[str.charAt(i) - 65]++;
				if (max < cnt[str.charAt(i) - 65]) {
					max = cnt[str.charAt(i) - 65];
					result = str.charAt(i);
				} else if (max == cnt[str.charAt(i) - 65]) {
					result = '?';
				}
			}
			System.out.println(result);

			sc.close();
		}
	}