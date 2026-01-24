import java.util.*;
public class ArrayProblem2 {
    public static void update(int marks[] ,int nonChangeable){
        nonChangeable=29;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            nonChangeable=10;
        }
    }
    public static void main(String[] args){
        int marks[]={97,88,99};
        int  nonChangeable=5;
        update(marks,nonChangeable);
        System.out.println(nonChangeable);
        
        //call the update function to print the update marks

        for(int i=0;i<marks.length;i++){           
            System.out.println(marks[i]);
        }
        System.err.println("");
    
    }
    
}
