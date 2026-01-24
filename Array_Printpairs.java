import java.util.*;
public class Array_Printpairs {
    //fnd the pairs of an array
    public static void printPairs(int[]arr){
        int tp=0;   //find total number of pairs //tp=n(n-1)/2
        for(int i=0;i<arr.length;i++){
            int curr=arr[i]; //2 4 6 8 10
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs:"+tp);
    }
    public static void main(String[]args){
        int[] arr={2,4,6,8,10};
        printPairs(arr);

        System.out.println("Total number of pairs:" + (arr.length*(arr.length-1)/2));
    }
}

//time complexity=O(n^2)
