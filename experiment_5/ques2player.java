package experiment_5;
class player{
    private String Name;
    private int age;
    private String position;
    public player(String Name,int age,String position){
        this.Name=Name;
        this.age=age;
        this.position=position;
    }
    public void play(){
        System.out.println(Name+" is playing in the position "+position);
    }
    public void train(){
        System.out.println(Name+" is training very hard at age" +age);
        System.out.println("---------------------");
    }
}
class C_player extends player{
    public C_player(String Name,int age,String position) {
        super(Name,age,position);
    }
}
class H_player extends player{
    public H_player(String Name, int age , String position){
        super(Name, age,position);
    }
}
class F_player extends player{
    public F_player(String Name, int age , String position){
        super(Name, age,position);
    }
}

public class ques2player {
    public static void main(String[] args) {
        C_player cricket=new C_player("Virat", 37, "batsman at 2");
        H_player hockey=new H_player("Asx", 21, "midfielder");
        F_player football=new F_player("Neymar", 23, "forward");

        cricket.play();
        cricket.train();
        hockey.play();
        hockey.train();
        football.play();
        football.train();
    }
}
