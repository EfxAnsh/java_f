package experiment_4;
class University {
 static String universityName;
 String studentName;
 
 static void displayUniversityName(){
    System.out.println("University Name: "+universityName);
 }
 public University(String studentName){
    this.studentName=studentName;
 }
 void displaystudentname(){
    System.out.println("Student Name: "+studentName);
 }
}
public class Uni{
    public static void main(String[] args) {
        University.universityName="GEU";
        University.displayUniversityName();
        University student1=new University("satvik");
        University student2=new University("Ansh");
        University student3=new University("Aman");
        student1.displaystudentname();
        student2.displaystudentname();
        student3.displaystudentname();
        University.universityName="UPES";
        University.displayUniversityName();
        student1.displaystudentname();
        student2.displaystudentname();
        student3.displaystudentname();
       
    }
}