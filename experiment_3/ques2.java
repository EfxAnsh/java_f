package experiment_3;

public class ques2 {
        public static int[] removeDuplicates(int[] arr) {
            
            int n = arr.length;
            int[] temp = new int[n];
            int count = 0;
    
            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < count; j++) {
                    if (arr[i] == temp[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    temp[count++] = arr[i];
                }
            }
    
            int[] result = new int[count];
            for(int i = 0; i < count; i++) {
                result[i] = temp[i];
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] duplicateArray = {2, 1, 3, 5, 5, 3, 2, 7, 2, 8, 7, 5};
            int[] uniqueArray = removeDuplicates(duplicateArray);
            System.out.print("Array without duplicates: ");
            for (int num : uniqueArray) {
                System.out.print(num + " ");
            }
        }
    }
