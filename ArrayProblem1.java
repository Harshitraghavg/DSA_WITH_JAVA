import java.util.*;
public class ArrayProblem1 { 
    public static void main(String[]args){
        int Marks[]= new int[5]; //Array Declaration
        //Find the percentage of marks by User input of 5 subjects
        // Scanner sc=new Scanner(System.in);
        // Marks[0]=sc.nextInt();
        // Marks[1]=sc.nextInt();
        //Marks[2]=sc.nextInt();
        // Marks[3]=sc.nextInt();
        // Marks[4]=sc.nextInt();
        // System.out.println("chemistry:"+Marks[0]);
        // System.out.println("Physics:"+Marks[1]);
        // System.out.println("Maths:"+Marks[2]);
        // System.out.println("Hindi:"+Marks[3]);
        // System.out.println("English:"+Marks[4]);

        int SubjectMarks[]={89,68,39,49,96}; //Array Initialization
        System.out.println("chemistry:"+SubjectMarks[0]);
        System.out.println("Physics:"+SubjectMarks[1]);
        System.out.println("Maths:"+SubjectMarks[2]);
        System.out.println("Hindi:"+SubjectMarks[3]);
        System.out.println("English:"+SubjectMarks[4]);
        
        //Find the Percentage of student;
        int percent=(SubjectMarks[0]+SubjectMarks[1]+SubjectMarks[2]+SubjectMarks[3]+SubjectMarks[4])/5;
        System.out.println("percentage of student is:"+percent+"%");        
    }
}
