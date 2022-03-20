package fis.topic01.practice01;

import java.util.Arrays;

public class SelectionSortStrategy implements ISortStrategy {

	@Override
	public void sort(int[] count) {
		
			System.out.println("Selection Sort!");

			int i, j, first, temp;
			for (i = count.length - 1; i > 0; i--) {
				first = 0;
				for (j = 1; j <= i; j++) {
					if (count[j] > count[first])
						first = j;
				}
				temp = count[first];
				count[first] = count[i];
				count[i] = temp;
			}
			
			System.out.println(Arrays.toString(count));


	}

}
