import java.util.*;
public class Array_ReverseArr {
    public static void ReverseArr(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            //swap
            int temp=arr[end]; 
            arr[end]=arr[start]; 
            arr[start]=temp;

            start++; //move forward
            end--;   //move backward
        }
    }
    public static void main(String[] args){
        int[] arr={2,4,6,8,10};
        ReverseArr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println( arr[i]+"");
        }
        System.out.println("");

    }
    
}
