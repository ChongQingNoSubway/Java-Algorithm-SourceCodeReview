package QueueStackLinkList;

public class SortArrayByPrity {
        public int[] sortArrayByParity(int[] A) {
            if(A == null || A.length < 2) return A;
            int left = 0;
            int right = A.length - 1;
            while (right - left > 0) {
                if (A[right] % 2 != 1 && A[left] % 2 != 0) {
                    int temp = A[left];
                    A[left] = A[right];
                    A[right] = temp;
                    right--;
                    left++;
                }
                else if (A[left] % 2 == 0) {
                    left++;
                }
                else if (A[right] % 2 == 1) {
                    right--;
                }else{
                    left++;
                    right--;
                }
            }
            return A;
        }
}
