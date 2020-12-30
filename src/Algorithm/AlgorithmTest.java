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
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}
