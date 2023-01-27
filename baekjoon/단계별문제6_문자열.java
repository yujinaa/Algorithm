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
	//1152	 단어의 개수
	import java.util.Scanner;
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			String word = input.nextLine(); //문자열 입력 
			String[] arr = word.split(" "); //공백을 기준으로 나눠 배열에 저장
			if (arr.length == 0) { //아무것도 입력하지 않았다면 배열의 크기가 0이므로 배열[0] 이런식으로 접근하면 에러가 뜨므로 아예 0을 프린트 해주고 종료
				System.out.println(0);
				System.exit(0); //프로그램 강제 종료
			}
			if (arr[0] == "") { //배열의 맨 앞이 공백이면 공백은 단어가 아니므로 길이 -1
				System.out.println(arr.length - 1);
			}  else { //정상적으로 길이 출력
				System.out.println(arr.length);
			}
		}
	}
	//2908	 상수
	import java.util.Scanner;
	public class Main {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			int num1 = input.nextInt(); 
			int num2 = input.nextInt();
			num1 = (num1%10) *100 + ((num1%100)/10)*10 + (num1/100); //num1을 10으로 나눈 나머지에 100을 곱하면 100의 자리가된다.
			num2 = (num2%10) *100 + ((num2%100)/10)*10 + (num2/100);
			System.out.println(num1>num2? num1:num2);//삼항연산자로 비교해 큰값을 출력한다.
		}
	}