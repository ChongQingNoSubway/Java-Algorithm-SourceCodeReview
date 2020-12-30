package Algorithm;

public class MergeSort {
        public void Sort(int array[], int left, int right){
            if(right == left) return;
            if(left < right)
            {
                int mid = (left + right) / 2;
                Sort(array, left, mid);
                Sort(array, mid + 1, right);
                Merge(array, left, right);
            }
        }

        public void Merge(int array[], int left, int right){
            int originalLeft = left;
            int length = right - left + 1;
            int mid = (left+right)/2;
            int result[] = new int[length];
            int leftPoint= left;
            int rightPoint = mid+1;

            int i = 0;

            while(leftPoint<=mid && rightPoint<=right){
                if(array[leftPoint]<array[rightPoint]){
                    result[i] = array[leftPoint];
                    leftPoint++;
                }else{
                    result[i] = array[rightPoint];
                    rightPoint++;
                }
                i++;
            }

            while(leftPoint>mid && rightPoint<=right){
                result[i] = array[rightPoint];
                i++;
                rightPoint++;
            }
            while(rightPoint>right && leftPoint <= mid){
                result[i] = array[leftPoint];
                i++;
                leftPoint++;
            }

            for(int j = 0; j < length; j++){
                array[originalLeft++] = result[j];
            }

        }
}
