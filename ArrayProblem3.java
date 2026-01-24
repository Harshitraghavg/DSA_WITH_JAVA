import java.util.*;
public class ArrayProblem3 {
    public static void addition(int nums[]){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]+4;
        }
    }

    public static void subtraction(int nums[]){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]-2;
        }
    }
    public static void main(String[]args){
        int j[]={};
        int nums[]= {20,30,40,50};
        addition(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println("");

        subtraction(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println("");
    }       
}
