import java.util.*;
public class Array_LargestNumber {
    // Function to get the largest number in an array
    public static void getLargestNumber(int number[]) {
        int largest = Integer.MIN_VALUE; //-Infinity
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        System.out.println("Largest number is: " + largest);
    }


    // Function to get the smallest number in an array
    public static void getSmallestNumber(int number[]) {
        int smallest = Integer.MAX_VALUE; //+Infinity
        for (int i =0; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
    }

    public static void main(String[] args) {
        int number[] = {1, 13, 10, 15, 9, 48, 59};

        getLargestNumber(number);
        getSmallestNumber(number);
    }
}
