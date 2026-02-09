public class ArrayProblem4 {
    public static int findCeil(int[] arr, int x) {
        int start= 0, end= arr.length - 1;
        int ceil = -1;

        while (start<= end) {
            int mid = (start + end ) / 2;

            // if (arr[mid] == x) {
            //     return arr[mid]; // exact match
            // } 
            if (arr[mid] > x) {
                ceil = arr[mid]; // possible ceil
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return ceil;
    }



    public static int findfloor(int[] arr, int  y) {
        int start= 0, end= arr.length - 1;
        int floor = Integer.MAX_VALUE;

        while (start<= end) {
            int mid = (start + end) / 2;

            // if (arr[mid] == y) {
            //     return arr[mid]; // exact match
            // } 
            if (arr[mid] > y) {
                floor= arr[mid]; // possible ceil
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return floor;
    }

    public static int findfirstPosition(int[] arr, int  z) {
        int start= 0, end= arr.length - 1;
        int first = Integer.MIN_VALUE;

        while (start<= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == z) {
                first=mid;
                end=mid-1;
            } 
            else if (arr[mid] > z) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return first;
    }
    
    //this problem base on BinarySearch Algorithm...........
    //to find the Ceiling element of X in a sorted array
    public static void main(String[] args){
        int[] arr = {1,2,8,10,10,12,19};
        int x = 5;  // give below value...ceil
        int y = 15; //give  upper value...floor
        
        //to find the Ceiling element of X in a sorted array
        int result = findCeil(arr, x);
        System.out.println("Ceil of Value" + x + " is: " + result);
        
        //to find the floor element of y in a sorted array
        int result1 = findfloor(arr, y);
        System.out.println("floor of Value " + y + " is: " + result1);
    }
}
