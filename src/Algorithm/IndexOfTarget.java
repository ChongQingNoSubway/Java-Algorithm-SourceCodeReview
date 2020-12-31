package Algorithm;

// return any target element's index

public class IndexOfTarget {
    public int binary_search(int a[], int target){
        if(a == null) return -1;
        int left = 0;
        int right = a.length -1;
        while(left <= right){
            int mid = (left + right)/ 2;
            if(a[mid] == target){
                return mid;
            }else if (a[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
