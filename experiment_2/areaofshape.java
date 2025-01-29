package experiment_2;
public class areaofshape {

        public double calcarea(double length, double breadth) {
            return length * breadth;
        }
    
        public double calcarea(double side) {
            return side * side;
        }
    
        public double calcarea(float radius) {
            return 3.14* radius * radius;
        }
    
        public double calcarea(float  base, float height) {
            return 0.5 * base * height;
        }
    
        public static void main(String[] args) {
            areaofshape calculator = new areaofshape();
    
            System.out.println("Area of Rectangle: " + calculator.calcarea(5.0, 3.0));
            System.out.println("Area of Square: " + calculator.calcarea(4.0));
            System.out.println("Area of Circle: " + calculator.calcarea(2.5f));
            System.out.println("Area of Triangle: " + calculator.calcarea(6.0f, 4.0f));
        }
    }
    
