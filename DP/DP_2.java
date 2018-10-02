package DP;

public class DP_2 {
	 public static long solution(int N) {
	      if(N == 1) return 4;
	      if(N == 2) return 6;
	      
	      long answer[] = new long[N];
	      answer[0] = 4;
	      answer[1] = 6;
	      for (int i = 2; i < N; i++) {
	         answer[i] = answer[i-1] + answer[i-2];
	      }
	      return answer[N-1];
	    }

	public static void main(String[] args) {
		long n = solution(5);
		System.out.println(n);
	}

}