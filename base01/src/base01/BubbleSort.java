package base01;

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = new int[] {5,6,1,2,3,7,8,4,5,6,3,7,8,2,12,7,34,5,6};
		print(nums);
		mySort(nums);
		print(nums);
	}

	private static void mySort(int[] nums) {
		for (int i = nums.length-1; i >=0 ; i--) {
			for (int j = 0; j < i; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		
	}

	private static void print(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
}
