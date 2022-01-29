
import java.util.Scanner;

public class quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();        //enter the size of the array
        int [] arr = new int [size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        quick obj = new quick();
        obj.quickSort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    void quickSort(int [] arr, int l, int r){
        if(l<r){
            int pi = partition(arr, l, r);
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, r);
        }
    }

    static int partition(int [] arr, int l, int r){
        int pivot = arr[r];
        int i = l-1;
        for(int j = l; j<r; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }
    static void swap(int [] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
