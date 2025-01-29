package experiment_3;
import java.util.*;
public class ques1 {
    
        public static void main(String[] args) {
            int[] arr = {12, 13, 1, 10, 34, 16};
            
            int result = findSecondLargest(arr);
            
            System.out.println("The second largest element is " + result);
        }
    
        public static int findSecondLargest(int[] arr) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
    
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] < max && arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
    
            return secondMax;
        }
    }
    