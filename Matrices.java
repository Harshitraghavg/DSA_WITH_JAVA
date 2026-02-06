import java.util.*;
public class Matrices {

    //search any element in the matrix
    public static boolean search(int matrix[][] , int key){
        for(int i=0; i<matrix.length;i++){          //travel row bais
            for(int j=0; j<matrix[0].length; j++){      // travel colm bais
                if(matrix[i][j]==key){
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    
    public static void main(String[] args){
        int matrix[][]=new int[3][3];
        int n=matrix.length;   //no. of rows
        int m=matrix[0].length; // no. of columns
        
        //print the matrix by given input
        //take matrix input
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n;i++){          //travel row bais
            for(int j=0; j<m; j++){      // travel colm bais
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix,8);

    }
}
