package Algorithm;

public class IndexOfTargetForTwoD {

// 2D matrix, sorted on each row, first element of next row is larger( or equal) to the last element of
// previous row , now  giving a target number, return the position that the large locates within the martrix
        public String binarySearch (int a[][], int target){
            if(a == null) return "the array is not correct";
            int row = a.length;
            int column = a[0].length;
            int TotallNumber = row * column;
            int left = 0;
            int right =  TotallNumber-1;

            while(left <= right){
                int mid = (left + right) / 2;
                int midRow = mid / column ;
                int midColumn = mid % column ;
                if(a[midRow][midColumn] == target){
                    return "Row:" + String.valueOf(midRow) + "   " + "Column:" + String.valueOf(midColumn) ;
                }else if(a[midRow][midColumn] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return "can not find locate of Target";
        }

}
