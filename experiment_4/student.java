package experiment_4;

 class student {
    String name;
    int age;

public student(){
this.name="Default";
this.age=19;
}
public student(String name , int age){
    this.name=name;
    this.age=age;
}
public void display(){
    System.out.println("Name: "+name+", age: "+age);
}
public static void main(String[] args) {
    
    student student1=new student();
    student1.display();
    student student2=new student("Anshuman",20);
    student2.display();
}
 }