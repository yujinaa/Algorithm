public class Solution_1 {
	//1.두수의 합
	class Solution1 {
		public int solution(int num1, int num2) {
			int answer = -1;
			answer = num1+ num2;
			return answer;       
		}
	}

	//	2. 두수의 차
	class Solution2 {
		public int solution(int num1, int num2) {
			int answer = num1- num2;

			return answer;
		}
	}

	//3.두수의 곱

	class Solution3 {
		public int solution(int num1, int num2) {
			int answer = 0;
			answer = num1 * num2;
			return answer;
		}
	}

	//4.몫 구하기

	class Solution4 {
		public int solution(int num1, int num2) {
			int answer = num1/num2;
			return answer;
		}
	}

	//5.두수의 나눗셈
	class Solution5 {
		public int solution(int num1, int num2) {
			int answer =  (int)((double)num1/num2*1000);
			return answer;
		}
	}

	//	6. 숫자 비교하기
	class Solution6 {
		public int solution(int num1, int num2) {
			int answer = 0;
			if(num1==num2){
				return 1;
			}else{
				return -1;
			}
		}
	}
	//if(num1 == num2) return 1;
	//else return -1;


	//분수의 덧셈
	class Solution7 {
		public int[] solution(int denum1, int num1, int denum2, int num2) {
			int denum = denum1*num2 + denum2*num1;
			int num = num1*num2;
			int gcd = getGcd(denum,num); 
			int[] answer = {denum/gcd, num/gcd};
			return answer;
		}

		public int getGcd(int num1, int num2){
			if(num1 % num2 == 0) {
				return num2;
			}
			else{
				return getGcd(num2 , num1 % num2);
			}
		}
	}
	//배열 두배 만들기
	class Solution8{
		public int[] solution(int[] numbers) {
			int[] answer = new int [numbers.length];
			for(int i=0; i<numbers.length; i ++) {
				answer[i] = numbers[i] *2;
			}
			return answer;
		}
	}
}
