import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		randomShuffle(arr);
	}

	public static void randomShuffle(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i <= arr.length - 1; i++) {
			int temp = rand.nextInt(arr.length);
			int temp1 = arr[temp];
			arr[temp] = arr[i];
			arr[i] = temp1;
		}
		System.out.println(Arrays.toString(arr));
	}
}