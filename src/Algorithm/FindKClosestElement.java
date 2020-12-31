package Algorithm;

import java.lang.reflect.Array;

public class FindKClosestElement {
    public int[] finder(int a[], int left, int right, int target, int k){
        if(k == 0) return null;
        int[] result  =new int [k];
        int mid;
        while(right-left >= k ){
            mid = (right + left) / 2;
            if(a[mid] > target){
                right = mid;
            }else if(a[mid] < target){
                left = mid;
            }else{
                int leftO = 1;
                int rightO = 1;
                result [0] = a[mid];
                int c =1;
                while(leftO+rightO-1<k){
                    if(Math.abs(a[mid -leftO] - target) > Math.abs(a[mid +rightO] - target)){
                        result[c] = a[mid + rightO];
                        rightO++;
                    }else{
                        result[c] = a[mid - leftO];
                        leftO++;
                    }
                    c++;
                }
                return result;
            }
        }
        for(int i = 0; i < result.length; i++){
            result [i] = a[left + i];
        }
        return result;
    }
}

