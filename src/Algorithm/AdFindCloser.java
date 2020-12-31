package Algorithm;

public class AdFindCloser {
    public int BinarySearch(int a[], int left , int right, int target){
        int mid ;
        while(right - left > 1){
            mid = (left + right)/2;
            if(a[mid] > target){
                right = mid;
            }else if( a[mid] < target){
                left = mid;
            }else{
                return mid;
            }
        }
        if(Math.abs(a[left] - target) >= Math.abs(a[right] - target)) return right;
        else
            return left;
    }
}
