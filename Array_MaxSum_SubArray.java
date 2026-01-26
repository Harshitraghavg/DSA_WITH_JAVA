import java.util.*;
public class Array_MaxSum_SubArray {
    public static void BruteForse_maxSum(int arr[]){            //time complexity=n^3
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        

        //this loop for find start element of the arr
        for(int i=0;i<arr.length;i++){
            int start=i;

            //this loop for find end element of the arr
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;

                //this loop for print the currSum of the arr
                for(int k=start;k<end;k++){
                    currSum +=arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }

            }
        }
        System.out.println("Maximum Subarray Sum is: "+maxSum);
    }







    // public static void PreFixSum(int arr[]){
    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;                                          //TIME COMPLICITY=N^2
    //     int[] prefix=new int[arr.length];

    //     //calculate prefix
    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i]=prefix[i-1]+arr[i];
    //     }

    //     //now find start and end value of arr
    //     for(int i=0;i<arr.length;i++){
    //         int start=i;
    //         for(int j=i;j<arr.length;j++){
    //             int end=j;

    //             currSum=start==0 ?prefix[end] : prefix[end]-prefix[start-1];

    //             if(maxSum<currSum){
    //                 maxSum=currSum;
    //             }
    //         }
    //     }

    //     System.out.println("maxSum:"+maxSum);
    // }

    // public static void KadansAlgorithm(int arr[]){                                      //+val + +val = +val
    //     int ms=Integer.MIN_VALUE;                                                      //Big_+val + small_-val = +val 
    //     int cs=0;                                                                       //Small_+val + big_-val = -val
    //     for(int i=0;i<arr.length;i++){                                                  //-val + -val = -val
    //         cs=cs+arr[i];
    //         if(cs<0){                                                                    //time complexity = O(n)
    //             cs=0;
    //         }
    //         ms=Math.max(cs,ms);
    //     }
    //     System.out.println("Maximum Subarray Sum is: "+ms);
    // }
    public static void main(String[] args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        //KadansAlgorithm(arr);
        //PreFixSum(arr);
        BruteForse_maxSum(arr);

    }
}
