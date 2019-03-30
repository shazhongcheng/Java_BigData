package base01;

public class SelectSort {
	public static void main(String[] args) {
		int[] nums = new int[] {5,6,1,2,3,7,8,4,5,6,3,7,8,2,12,7,34,5,6};
		print(nums);
		mySort(nums);
		print(nums);
	}

	private static void mySort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
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
