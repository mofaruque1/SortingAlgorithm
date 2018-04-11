package test;

public class NewSortingAlg {
	public static void Sort(int[] array) {
		int length = array.length;
		boolean check = true;

		System.out.println("Before:");
		for (int i : array) {
			System.out.print(i + " ");
		}

		while (check) {
			check = false;
			for (int i = 1; i < length; i++) {
				if (array[i] < array[i - 1]) {
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					check = true;
				}
			}
		}

		System.out.println("\nAfter:");
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		int[] array = { 10, 15, 1, 60, 5, 100, 25, 50 };
		NewSortingAlg.Sort(array);
	}

}
