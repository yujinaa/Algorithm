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