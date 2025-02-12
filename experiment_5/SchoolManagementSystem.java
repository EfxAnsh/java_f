package experiment_5;

abstract class Person {
    abstract void performDuty();
}

class Student extends Person {
    @Override
    void performDuty() {
        System.out.println("Student is studying for exams.");
    }
}


class Teacher extends Person {
    @Override
    void performDuty() {
        System.out.println("Teacher is preparing and delivering lectures.");
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        
        people[0] = new Student();
        people[1] = new Teacher();
        people[2] = new Student();
        people[3] = new Teacher();
        
        for (Person person : people) {
            person.performDuty();
        }
    }
}