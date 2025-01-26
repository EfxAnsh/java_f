import java.util.*;
public class praticeifelse {
    public static void main(String args[]){
        System.out.println("Enter number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
       if(num==0){
        System.out.println("not valid");
       }
        else  if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        sc.close();
    }

    
}
