package Algorithm;

public class FirstOcurrence {
    public int finder(int a[],int left, int right, int target){
        int mid;
        while(right-left > 1){
            mid = (left + right) / 2;
            if(a[mid] > target){
                left = mid;
            }else if(a[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        if(a[left] == target){
            return left;
        }
        if(a[right] == target){
            return right;
        }
        return -1;
    }
}
