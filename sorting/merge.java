package sorting;

import java.util.Scanner;

class merge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0, r = size;
        merge obj = new merge();
        obj.sort(arr, l, r-1);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
    }

    void sort(int [] arr, int l, int r){
        if(l<r){
            int m = l + (r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);

            mergeSort(arr, l, m, r);
        }
    }

    void mergeSort(int [] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int [] L = new int[n1];
        int [] R = new int[n2];

        for(int i=0; i<n1; i++){
            L[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m+i+1];
        }
        int k = l;
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else arr[k] = R[j++];
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}