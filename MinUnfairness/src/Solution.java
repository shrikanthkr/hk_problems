import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	static int smallest, large;

	public static void main(String[] args) throws NumberFormatException,
	IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int K = Integer.parseInt(in.readLine());
		int[] list = new int[N];
		int current[];
		for (int i = 0; i < N; i++)
			list[i] = Integer.parseInt(in.readLine());
		Arrays.sort(list);
		int unfairness = smallest = Integer.MAX_VALUE;
		for (int i = 0; i <= N - K; i++) {
			current = Arrays.copyOfRange(list, i, i + K);
			setMaxMin(current);

			unfairness = (large - smallest) < unfairness ? (large - smallest): unfairness;
			large=0;
			smallest = Integer.MAX_VALUE;

		}

		System.out.println(unfairness);
	}

	public static void setMaxMin(int[] current) {
		large = current[current.length-1];
		smallest = current[0];
	}
}
