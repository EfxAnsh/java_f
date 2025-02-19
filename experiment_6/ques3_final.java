package experiment_6;

class MathConstants {
  
    final double PI = 3.14159;
    
   
    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

class Circle extends MathConstants {
    
   
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    
    
    //@Override
    //void displayPI() {
      //  System.out.println("Overriding final method");
   // }
//}


public class ques3_final {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.displayPI(); 
        circle.calculateArea(5.0); 
        
        
        /*
        circle.PI = 3.14; // cannot assign a value to final variable 'PI'
        */
    }
}
}


