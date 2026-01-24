import java.util.*;
public class Array_BinarySearch {
    public static void binarysearch(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        
        //comparision 
        while(start<=end){
            int mid=(start+end)/2;    //{1,2,3,4,5,6}

            if(nums[mid]==target){
                System.out.println("Element found at index: " + mid);
                return ;
            }
            if(nums[mid]<target){ //right  2nd half
                start=mid+1;
            }
            else{               //left  1st half
                end=mid-1;
            }
        }
        System.out.println("Element not found");
        return ; //element not found
    }
    public static void main(String[] agrs){
        int[] nums={1,2,3,4,5,6};
        int target=15;
        binarysearch(nums,target);
        
    }
}


// Key DSA Concepts Used
// BinarySearch
//this algorithm works onsorted array 
// Sequential comparison
// Time Complexity: O(logn)
// Best Case: O(1)
// Worst Case: O(logn)
