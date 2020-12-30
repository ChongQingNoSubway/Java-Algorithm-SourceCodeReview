package Algorithm;

public class SelectionSort {
    public void Selector(int a[], int n){
        int global, temp;
        for(int i=0; i<n-1;i++){
            global = i;
            for(int j = i+1; j<n; j++){
                if(a[j] < a[global]){
                    global = j;
                }
            }
            temp = a[i];
            a[i] = a[global];
            a[global] = temp;
        }
    }
}
