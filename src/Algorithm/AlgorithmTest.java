package Algorithm;

public class AlgorithmTest {
    public static void main(String[] args) {
//        ValidParentheses valid = new ValidParentheses();
//        String myString = "{((}";
//        boolean result = valid.isValid(myString);
//        System.out.println(result);
//
//
//        MutiplyString muti = new MutiplyString();
//        String num1 = "2";
//        String num2 = "717";
//        String result2 = muti.multiply(num1, num2);
//        System.out.println(result2);


        int A[] = {3, 15, 54, 22, 33, 29, 95, 66};
        MergeSort myMergeSort = new MergeSort();
        myMergeSort.Sort(A, 0, A.length - 1);
        System.out.println("\n Sorted Array");
        printArray(A);

        IndexOfTarget findTarget = new IndexOfTarget();
        int index  = findTarget.binary_search(A,99);
        System.out.println(index);



        int [] intA[] ={{1,2,4,5},{7,9,14,16},{17,20,21,26}};
        IndexOfTargetForTwoD finder = new IndexOfTargetForTwoD();
        String result = finder.binarySearch(intA,7);
        System.out.println(result);

        System.out.println("\n find Closer");
        FindCloserNumber myFind = new FindCloserNumber();
        int x = myFind.FindCloser(A,1);
        System.out.println(x);


        int [] b = { 1, 2, 5,5,5,7,7,8,9,9,10};
        FirstOcurrence firstO = new FirstOcurrence();
        int fistResult = firstO.finder(b,0, b.length -1, 3);
        System.out.println("\n first");
        System.out.println(fistResult);

        LastOccurence lastO = new LastOccurence();
        int lastResult = lastO.finder(b,0,b.length -1, 3);
        System.out.println("\n last");
        System.out.println(lastResult);

        System.out.println("\n k - Closest - el");
        int C[] = {1, 2, 3, 4, 5, 11, 15, 23, 26};
        FindKClosestElement F = new FindKClosestElement();
        int[] myresult = F.finder(C,0,A.length-1,5,4);
        printArray(myresult);

        System.out.println("\n ====================");
        FindFirstAndLast solve = new FindFirstAndLast();
        int D[] = {5,7,7,8,8,10};
        int re[] = solve.searchRange(D,8);
        printArray(re);
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}
