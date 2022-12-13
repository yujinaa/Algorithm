package 사칙연산;

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

}