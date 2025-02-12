package experiment_5;
class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return 0; 
    }

    public void displayPay(int hours) {
        System.out.println("Worker: " + name + ", Weekly Pay: $" + computePay(hours));
    }
}
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; 
        return daysWorked * salaryRate;
    }
}
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; 
    }
}

public class ques4_worker {
    public static void main(String[] args) {
        Worker w1 = new DailyWorker("John", 100);
        Worker w2 = new SalariedWorker("Alice", 50);

        System.out.println("\nDaily Worker Salary Calculation:");
        w1.displayPay(40); 

        System.out.println("\nSalaried Worker Salary Calculation:");
        w2.displayPay(50); 
    }
}
