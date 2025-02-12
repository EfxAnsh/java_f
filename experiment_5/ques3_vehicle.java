package experiment_5;
class Vehicle {
    String brand, model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}
class ElectricCar extends Car {
    int batteryCapacity;
    double chargingTime;

    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hrs");
    }
}
class Motorcycle extends Vehicle {
    int engineCapacity;
    String type;

    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc, Type: " + type);
    }
}


public class ques3_vehicle {
        public static void main(String[] args) {
            Vehicle v1 = new Vehicle("Toyota", "Corolla", 25000);
            Car c1 = new Car("Honda", "Civic", 28000, 5, "Petrol");
            ElectricCar e1 = new ElectricCar("Tesla", "Model S", 80000, 5, "Electric", 100, 1.5);
            Motorcycle m1 = new Motorcycle("Yamaha", "R1", 20000, 998, "Sport");
    
            System.out.println("\nVehicle Details:");
            v1.displayDetails();
    
            System.out.println("\nCar Details:");
            c1.displayDetails();
    
            System.out.println("\nElectric Car Details:");
            e1.displayDetails();
    
            System.out.println("\nMotorcycle Details:");
            m1.displayDetails();
        }
    }
    
