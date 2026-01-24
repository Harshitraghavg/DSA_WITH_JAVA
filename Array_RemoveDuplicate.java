import java.util.*;
public class Array_RemoveDuplicate {

    public static void RemoveDuplicate(int[] arr){
        int n=arr.length;
        if(n>1){
            int j=0;
            for(int i=0;i<n-1;i++){
                if(arr[i]!=arr[i+1]){
                    i++;
                    arr[i]=arr[i+1];
                }
            }

        }
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,4,4};
        RemoveDuplicate(arr);
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            System.out.println(arr[i+1]+"");
        }
    }
}
