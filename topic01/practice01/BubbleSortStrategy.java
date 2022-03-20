package fis.topic01.practice01;

public class BubbleSortStrategy implements ISortStrategy {

	@Override
	public void sort(int[] count) {
		int n = count.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (count[j] > count[j + 1]) {
                    // swap count[j+1] và count[i]
                    int temp = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = temp;

	}
	}
}
