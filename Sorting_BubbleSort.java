import java.util.*;
public class Sorting_BubbleSort {
    // public static void BubbleSort(int[] arr){
    //     for(int turn=0;turn<arr.length-1;turn++){
    //         for(int j=0;j<arr.length-1-turn;j++){
    //             //swap
    //             if(arr[j]>arr[j+1]){
    //                 int tmp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=tmp;
    //             }
                
    //         }
    //     }
    // }

    public static void BubbleSort(int[] arr){     //this is for sorted array
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                //swap
                if(arr[j]>arr[j+1]){                                          //worst case -time complexity=O(n^2)
                    int tmp=arr[j];                                            //sorted arry time complexity best case =O(n^2)
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    swap++;  
                }               
            }
        }
    }

    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        BubbleSort(arr);
        printarr(arr);
        
    }
}
