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
