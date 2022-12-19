import java.util.ArrayList;

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

	//나머지 구하기
	class Solution9{
		public int solution(int num1, int num2) {
			int answer = num1%num2;
			return answer;
		}
	}

	//중앙값 구하기
	import java.util.ArrayList;
	class Solution10{
		public int solution(int array[]) {
			ArrayList.sort(array); 
			int answer= array[array.length/2];
			return answer;
		} 



		//나이 출력하기
		class Solution11{
			public int solution(int age) {
				int answer = 0;
				int year=2022;
				answer = (year-age)+1;
				return answer;
			}
		}

		//각도기
		class Solution12{
			int solution(int angle) {
				int answer = 0;
				if( angle<90){
					answer = 1;
				}else if(angle==90){
					answer = 2;
				}else if(angle<180){
					answer = 3;
				}else if(angle==180){
					answer = 4;
				}
				return answer;
			}

			//배열 평균값
			//// numbers_len은 배열 numbers의 길이입니다.
			class Solution13{
				double solution(int numbers[], size_t numbers_len) {
					double answer=0;
					double sum = 0;
					for(int i =0;i< numbers_len;i++){
						sum+=numbers[i];
					}

					return answer=sum/numbers_len;
				}

				//짝수의 합
				class Solution14{
					int solution(int n) {
						int answer = 0;
						for(int i =0;i<=n;i++){
							if(i%2==0){
								answer +=i;
							}
						}
						return answer;
					}

					//중복된 숫자개수
					// array_len은 배열 array의 길이입니다.
					class Solution14{
						int solution(int array[], size_t array_len, int n) {
							int answer = 0;
							for(int i=0;i<array_len;i++){
								if(array[i]==n)
									answer++;
							}
							return answer;
						}
						//양꼬치
						class Solution15{
							int solution(int n, int k) {
								int answer = 0;
								answer=(n*12000)+((k-(n/10))*2000);
								return answer;
							}
						}
						
						//머쓱이보다 키 큰 사람
						class Solution16 {
						    public int solution(int[] array, int height) {
						        int answer = 0;
						        for(int i =0;i<array.length;i++)
						        if(array[i]>height){
						           answer++;
						        }
						         return answer;
						    }
						}

