import java.util.*;
public class Array_LinearSearch {

    // public static void LinearSearch(int number[], int key) {
    //     for (int i = 0; i < number.length; i++) {
    //         if (number[i] == key) {
    //             System.out.println("Key is found at index: " + i);
    //             return;
    //         }
    //     }
    //     System.out.println("Not Found");
    // }

    public static void HotelMenu(String Menu[],String item){
        for(int i=0;i<Menu.length;i++){
            if(Menu[i]==item){
                System.out.println("Item is available at number 2nd:"+Menu[i]);
                return;
            }
        }
        System.out.println("Item is not available");
    }

    public static void main(String[] args) {
        // int number[] = {1, 13, 10, 15, 9, 48, 59};       
        // int key = 44;
        // LinearSearch(number, key);

        String Menu[]={"1.samosa","2.pizza","3.burger","4.dosa","5.idli" };
        String item="2.pizza";
        HotelMenu(Menu,item);
    }
}

// Key DSA Concepts Used
// Linear Search
// Sequential comparison
// Time Complexity: O(n)
// Best Case: O(1)
// Worst Case: O(n)
