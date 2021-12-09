import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] array = new int[] {5, 2, 4};
		int [] sorted = quicksort(array, 0, array.length - 1);
		//System.out.println(Arrays.toString(sorted));

	}
	

	public static int[] quicksort(int[] array,  int left, int right) {
		
		if(left >= right) {
			return array;
		}
		
		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index - 1);
		quicksort(array, index, right);
		System.out.println(Arrays.toString(array));
		return array;
		
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		
		while(left <= right) {
			
			while(array[left] < pivot) {
				left++;
			}
			
			while(array[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
			
		}
		
		return left;
		
	}
	
	public static void swap(int[] array, int left, int right) {
		
		int tempLeft = array[left];
		array[left] = array[right];
		array[right] = tempLeft;
		
	}

}
