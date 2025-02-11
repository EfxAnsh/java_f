package experiment_5;

class superclass{
    private int Pvar=10;

    public int getPvar(){
        return Pvar;
    }
}
class subclass extends superclass{
    public void display (){
       // System.out.println("value= "+Pvar);
        System.out.println("value= " +getPvar());
    }
}
public class ques_1SC {
    public static void main(String[] args) {
        
        subclass obj=new subclass();
        obj.display();
    }
}
