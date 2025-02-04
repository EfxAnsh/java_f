package experiment_4;
class courseregister{
    private String courseName;
    private String coursecode;

    public courseregister(String courseName, String coursecode){
        this.courseName=courseName;
        this.coursecode=coursecode;
    }
    public void displaycoursedetail(){
        System.out.println("Course Name: "+this.courseName);
        System.out.println("Course code: "+this.coursecode);
    }
}
public class course {
    public static void main(String[] args) {
        courseregister course1=new courseregister("OOPS","OOP123");
        course1.displaycoursedetail();
    }
}
