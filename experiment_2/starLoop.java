package experiment_2;
public class  starLoop {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = rows; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(" "+j);
            }
            System.out.println(); 
        }
    }
}