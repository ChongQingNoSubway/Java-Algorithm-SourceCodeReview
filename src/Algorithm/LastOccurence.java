package Algorithm;

public class LastOccurence {
    public int finder(int a[], int left, int right, int target){
        int mid;
        while(right - left > 1){
            mid = (left + right) / 2;
            if(a[mid] == target){
                left =  mid;
            }else if(a[mid] > target){
                right = mid - 1;
            }else if(a[mid] < target){
                left = mid + 1;
            }
        }
        if(a[right] == target){
            return right;
        }
        if(a[left] == target){
            return left;
        }
        return -1;
    }
}
