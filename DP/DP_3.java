package DP;

public class DP_3 {

	// 최대값을 구하는 메소드
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// 최대값을 찾는 메소드
	static int findMax(int[][] dp) {
		int n = dp.length;
		int max = 0;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					dp[i][j] += dp[i - 1][j];
				} else if (j == i) {
					dp[i][j] += dp[i - 1][j - 1];
				} else {
					dp[i][j] += max(dp[i - 1][j], dp[i - 1][j - 1]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			max = max(max, dp[n - 1][i]);
		}

		return max;
	}

	public static int solution(int[][] triangle) {
		int answer = 0;

		answer = findMax(triangle);

		return answer;
	}

	public static void main(String[] args) {
		int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };

		int answer = solution(triangle);

		System.out.println(answer);
	}
}
