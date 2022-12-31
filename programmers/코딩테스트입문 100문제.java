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

						//배열 뒤집기
						class Solution17 {
							public int[] solution(int[] num_list) {
								int[] answer = new int[num_list.length];
								for(int i = 0;i<num_list.length;i++){
									answer[i]=num_list[num_list.length-i-1];
								}
								return answer;
							}
						}


						//피자나눠먹기(3)
						class Solution {
							public int solution(int slice, int n) {
								int answer = 0;
								if(n%slice==0){
									answer=n/slice;
								}else{
									answer=(n/slice)+1;
								}
								return answer; 
							} 
						}

						//피자나눠먹기(1)

						class Solution {
							public int solution(int n) {
								int answer = 0;
								if(n%7==0){
									answer=n/7;
								}else{
									answer=(n/7)+1;
								}
								return answer;
							}
						}

						//피자나눠먹기(1) 다른풀이
						class Solution {
							public int solution(int n) {
								int answer = (n%7==0) ? n/7 : n/7 + 1;

								return answer;
							}
						}

						//문자열뒤집기
						class Solution {
							public String solution(String my_string) {
								String answer = "";
								for(int i=my_string.length()-1;i>=0;i--){
									answer+=my_string.substring(i,i+1);
								}
								return answer;
							}
						}
						//최댓값 만들기(1)
						int solution(int numbers[], size_t numbers_len) {
							int answer = 0;
							int max=0;
							for(int i =0;i<numbers_len;i++){
								for(int j =0;j<numbers_len;j++){
									if(i!=j && numbers[i] *numbers[j]>max){
										max=numbers[i]*numbers[j];
									}
								}          
							}
							answer=max;   
							return answer;          
						}

						//점의 위치 구하기
						class Solution {
							public int solution(int[] dot) {
								int answer = 0;
								int x = dot[0];
								int y= dot[1];

								for(int i =1;i<dot.length;i++){
									if(x>0){
										if(y>0){
											answer=1;
										}else{
											answer=4;
										}
									}else{
										if(y<0){
											answer=3;
										}else{
											answer=2;
										}
									}

								}
								return answer;
							}
						}

						//직각삼각형 만들기
						import java.util.Scanner;

						public class Solution {
							public static void main(String[] args) {
								Scanner sc = new Scanner(System.in);
								int n = sc.nextInt();

								for(int i=0; i<n; i++){
									for(int j=0; j<=i; j++){
										System.out.print("*");
									}
									System.out.println();
								}

							}
						}
						//다른 풀이
						import java.util.Scanner;

						public class Solution {
							public static void main(String[] args) {
								Scanner sc = new Scanner(System.in);
								int n = sc.nextInt();
								for(int i=1; i<=n; i++) {
									System.out.println("*".repeat(i));
								}
							}
						}
						//피자먹기(2)
						class Solution {
							public int solution(int n) {
								int answer = 1;

								while(true){
									if(6*answer%n==0) break;
									answer++;
								}

								return answer;
							}
						}
						//피자 다른풀이
						class Solution {
							public int solution(int n) {
								int answer = 0;
								int max = 0;

								for(int i =1;i<=n && i<=6;i++){
									if(n%i==0 && 6%i==0){
										max=i;
									}         
								}
								answer=n*6/max/6;
								return answer;
							}
						}
						//						짝수 홀수 개수
						class Solution {
							// num_list_len은 배열 num_list의 길이입니다.
							public int* solution(int num_list[], size_t num_list_len) {
								// return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
								int* answer = (int*)malloc(1);
								int odd=0;
								int even=0;
								for(int i =0;i<num_list_len;i++){
									if(num_list[i]%2==0){
										even++;
									}else{
										odd++;
									}
								}
								answer[0]=even;
								answer[1]=odd;
								return answer;
							}
						}
						//다른풀이
						class Solution {
							// num_list_len은 배열 num_list의 길이입니다.
							public int* solution(int num_list[], size_t num_list_len) {
								// return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
								for(int i = 0; i < num_list.length; i++) {
									answer[num_list[i] % 2]++;
								}
							}
						}
						//배열 원소의 길이
						class Solution {
							public int[] solution(String[] strlist) {
								int[] answer = new int[strlist.length];
								for(int i = 0;i<strlist.length;i++){
									answer[i]=strlist[i].length();
								}
								return answer;
							}
						}
						//아이스 아메리카노
						class Solution {
							public int[] solution(int money) {
								int[] answer = new int[2];
								answer[0]=money/5500;
								answer[1]=money%5500;
								return answer;
							}
						}

