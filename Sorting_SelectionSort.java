import  java.util.*;
public class Sorting_SelectionSort {
    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length-1 ; i++){
            int minpos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minpos]<arr[i]){
                    minpos=j;
                }
            }
            //swap
            int tmp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=tmp;
        }
    }


    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);
    }
}
