package uni1;


    public class Bus extends Vehicle {
        //pass aguments to constructor of the parent class
        public Bus(String name, int mileage, int capacity) {
            super(name, mileage, capacity);
        }

        public double fare() {//overwrite parent method
            double totalFare = super.fare();//call base method
            return totalFare + 0.1 * totalFare;//add 10%
        }
    }

