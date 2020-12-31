package Algorithm;
// find an element in the array that is closest to the target number?
public class FindCloserNumber {

    public int FindCloser(int[]a, int target){
        if(a == null) return -9999;
        int length = a.length;
        int left = 0;
        int right = length -1;
        while(right - left >= 1){
            int mid = (left + right) / 2;
            if(a[mid] == target) {
                return a[mid];
            }
            else if(a[mid] > target){
                right = mid - 1;
                if(right -left == 1){
                     if( target - a[left] > a[right] - target) return a[right];
                     return a[left];
                }
            }else{
                left = mid + 1;
                if(right -left == 1){
                    if( target - a[left] > a[right] - target) return a[right];
                    return a[left];
                }
            }
        }
        return a[right];
    }

}
