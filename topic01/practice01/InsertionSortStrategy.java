package fis.topic01.practice01;

import java.util.Arrays;

public class InsertionSortStrategy implements ISortStrategy {

	@Override
	public void sort(int[] count) {
		System.out.println("Insertion Sort!");

		for (int i = 1; i < count.length; i++) {
			int temp = count[i];
			int j;
			for (j = i - 1; (j >= 0) && (count[j] > temp); j--) {
				count[j + 1] = count[j];
			}
			count[j + 1] = temp;
		}

		System.out.println(Arrays.toString(count));
	}

}
