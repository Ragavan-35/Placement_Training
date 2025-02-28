import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Third Maximum Number in 2D Array");
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int current = arr[i][j];
                
                
                if (current > largest) {
                    thirdLargest = secondLargest;
                    secondLargest = largest;
                    largest = current;
                    
                    
                } else if (current > secondLargest && current < largest) {
                    thirdLargest = secondLargest;
                    secondLargest = current;
                    
                    
                } else if (current > thirdLargest && current < secondLargest) {
                    thirdLargest = current;
                }
            }
        }
        if (thirdLargest != Integer.MIN_VALUE) {
            System.out.println("Third Highest Number: " + thirdLargest);
        } else {
            System.out.println("No third maximum value.");
        }
    }
}
