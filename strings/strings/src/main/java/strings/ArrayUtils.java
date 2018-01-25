package strings;

public class ArrayUtils {

	public int[] rotateArray(int[] arr, int numOfRotations) {

		if (arr == null || arr.length == 0)
			return new int[] {};

		if (arr.length == 1)
			return arr;
		while (numOfRotations > 0) {

			int j = 0;
			int temp = arr[j];
			for (int k = 0; k <= arr.length - 1; k++) {
				if (k == arr.length - 1) {
					arr[k] = temp;
				} else {
					arr[k] = arr[k + 1];
				}

			}
			numOfRotations--;
		}

		return arr;
	}
}
