package baekjoon.단계별문제;

//15596. 정수 N개의 합
class Test {
  long sum(int[] a) {
      long ans = 0;
      for (int val : a) {
          ans += val;
      }
      return ans;
  }
}
//다른 풀이
public class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}

//4673.셀프 넘버
public class Main {
	public static int d(int num) {
		int sum = num;
		while(num!=0) {
			sum+= num%10;
			num/=10;
		}
		return sum;
	}
	public static void main(String args[]){
		boolean[] a = new boolean[10001];
		for(int i =1;i<10001;i++) {
			int n= d(i);
			if(n<=10000) { 
				a[n]=true;
			}
		}
		for(int i = 1;i<10001;i++) {
			if(a[i]==false) {
				System.out.println(i);
			}
		}
	}
}
//1065	 한수
import java.util.Scanner;
public class Main {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int result = 99;
	
	if(n<100) {
		System.out.println(n);
	}else {
		for(int i =100;i<=n;i++) {
			result+= chkNum(i);
		}
		System.out.println(result);
	}
	}
private static int chkNum(int n) {
	int hun = n / 100;
	int ten = n % 100/10;
	int one = n % 10;
	// 등차수열의 특징 : 가운데 숫자에 2를 곱하면 직전과 직후 숫자의 합과 동일하다.
	if (ten * 2 == hun + one) {
		return 1;
	}
	return 0;
}
}
