import java.util.*;
public class greater {
    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("enter value of a: ");
     int a=sc.nextInt();
     System.out.println("enter value of b: ");
     int b=sc.nextInt();
     if(a>b){
        System.out.println("a is greater than b !");
     }else if(a==b){
        System.out.println("both  are equal! ");
     }else{
        System.out.println("b is greater than a!");
     }
     sc.close();
    }
    
}
