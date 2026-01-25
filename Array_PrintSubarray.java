import java.util.*;

//FIND THE SUBARRAYS OF AN ARRAY AND PRINT THEN

public class Array_PrintSubarray {
    public static void printSubarray(int[] arr){
        int TSA=0;
        for(int i=0;i<arr.length;i++){
           int start=i;            // find start value by outer loop
            for(int j=i;j<arr.length;j++){
                int end=j;          // find end value by inner loop
                for(int k=start;k<end;k++){
                    System.out.print(arr[k]+"  ");// print subarray from start to end
                }
                TSA++;
                System.out.println();          
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + TSA);
    }
    public static void main(String[] args){
        int[] arr={2,4,5,6,8,9};
        printSubarray(arr);
    }
}
