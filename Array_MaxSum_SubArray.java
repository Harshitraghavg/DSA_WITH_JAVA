import java.util.*;
public class Array_MaxSum_SubArray {

    public static void KadansAlgorithm(int arr[]){                                      //+val + +val = +val
        int ms=Integer.MIN_VALUE;                                                      //Big_+val + small_-val = +val 
        int cs=0;                                                                       //Small_+val + big_-val = -val
        for(int i=0;i<arr.length;i++){                                                  //-val + -val = -val
            cs=cs+arr[i];
            if(cs<0){                                                                    //time complexity = O(n)
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum Subarray Sum is: "+ms);
    }
    public static void main(String[] args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        KadansAlgorithm(arr);

    }
}
