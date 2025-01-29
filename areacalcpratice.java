public class areacalcpratice {
    public double calcuarea(double length,double breadth){
        return length*breadth;
    }
    public double calcuarea(double side){
        return side * side;

    }
    public double calcuarea(float radius){
        return 3.14*radius*radius;
    }
    public double calcuarea(float base, float height){
        return 0.5*base*height;
    }
    public static void main(String[] args) {
        areacalcpratice calc=new areacalcpratice();
        System.out.println("Area of Rectangle: " + calc.calcuarea(5.0, 3.0));
            System.out.println("Area of Square: " + calc.calcuarea(4.0));
            System.out.println("Area of Circle: " + calc.calcuarea(2.5f));
            System.out.println("Area of Triangle: " + calc.calcuarea(6.0f, 4.0f));
    }

}
