import java.util.*;
import java.util.Arrays;   //for sorting in increasing order
import java.util.Collections;  // for sorting in  deacreasing order by using inbuilt function

public class Sorting_InsertionSort {

    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //find out the correct pos to insert
            while(prev >=0 && arr[prev] > arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void CountSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest,arr[i]);
        }
        
        //this loop for create new count array
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //now sorting the array by this loop
        int j=0;
        for(int i=0; i<arr.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] agrs){
        //int arr[]={5,3,4,6,9};
        int arr[]={2,3,1,1,3,4,5};

        //Arrays.sort(arr);                                   // time complexity = O(nlogn)
        //Arrays.sort(arr,Collections.reverseOrder());        //decreasing order

        //InsertionSort(arr);                                  //time complexity = O(n^2)

        CountSort(arr);                                        // time complexity = O(n)

        printarr(arr);
    }
}
