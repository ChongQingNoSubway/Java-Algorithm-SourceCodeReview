package Algorithm;

public class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = binarySearchRorL(nums, target, 1);
        result[1] = binarySearchRorL(nums, target, 2);
        return result;

    }



    public int binarySearchRorL(int[] nums, int target, int direction){
        int mid;
        int left = 0, right = nums.length - 1;
        while(right - left > 1) {
            mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid]> target) {
                right = mid - 1;
            }
            else{
                // direction =  1 find fitst index
                // direction =  2 find last index
                if (direction == 1) {
                    right = mid;
                }
                else if(direction == 2){
                    left = mid;
                }
            }
        }
        if(direction == 1){
            if(nums[left] == target) return left;
            if(nums[right] == target) return right;
            return -1;
        }
        if(direction == 2){
            if(nums[right] == target) return right;
            if(nums[left] == target) return left;
            return -1;
        }

        return -1;

    }
}
