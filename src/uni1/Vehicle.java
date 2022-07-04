package uni1;

public class Vehicle {
    private String name;
    private int mileage;
    private int capacity;


    public Vehicle(String name, int mileage, int capacity) {//constructor
        this.name = name;
        this.mileage = mileage;
        this.capacity = capacity;
    }

    public double fare() {
        return this.capacity * 100;
    }//method of calculating the price
}
