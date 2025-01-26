import java.util.*;
public class gradingpratice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter marks of subject 1: ");
       int a=sc.nextInt();
       System.out.println("enter marks of subject 2: ");
       int b=sc.nextInt();
       System.out.println("enter marks of subject 3: ");
       int c=sc.nextInt();
        double average=(a+b+c)/3;
        if(a>100||b>100||c>100){
            System.out.println("invalid marks entered ");
        }else{

        if(average>=90){
            System.out.println("Grade=A");
        }else if(average>=75){
            System.out.println("Grade=B");
        }else if(average>=50){
            System.out.println("Grade=C");

        }else{
            System.out.println("Fail");
        }
    }
}
}