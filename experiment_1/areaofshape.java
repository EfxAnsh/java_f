package experiment_1;
public class areaofshape {

        public double calculateArea(double length, double breadth) {
            return length * breadth;
        }
    
        public double calculateArea(double side) {
            return side * side;
        }
    
        public double calculateArea(float radius) {
            return Math.PI * radius * radius;
        }
    
        public double calculateArea(double base, double height, boolean isTriangle) {
            return 0.5 * base * height;
        }
    
        public static void main(String[] args) {
            areaofshape calculator = new areaofshape();
    
            System.out.println("Area of Rectangle: " + calculator.calculateArea(5.0, 3.0));
            System.out.println("Area of Square: " + calculator.calculateArea(4.0));
            System.out.println("Area of Circle: " + calculator.calculateArea(2.5f));
            System.out.println("Area of Triangle: " + calculator.calculateArea(6.0, 4.0, true));
        }
    }
    
