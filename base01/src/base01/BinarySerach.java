package base01;

public class BinarySerach {
	public static void main(String[] args) {
		int [] nums=new int[] {1,2,3,4,5,6,7,8,10};
		
		System.out.println(binarySerach(nums,5));
		System.out.println(binarySerach(nums,11));
		System.out.println(binarySerach(nums,9));
		System.out.println(binarySerach(nums,0));
	}

	private static int binarySerach(int[] nums, int goal) {
		int left=0,right=nums.length-1;
		int mid;
		while(left<=right) {
			mid=(left+right);
			if(goal<nums[mid]) {
				right=mid-1;
			}else if (goal>nums[mid]) {
				left=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
}
