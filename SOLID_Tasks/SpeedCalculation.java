package SOLID_Tasks;

// Переписать код SpeedCalculation в соответствии с Open-Closed Principle

interface SpeedCalculation {

    public double calculateAllowedSpeed();
}

class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

}

class Bus extends Vehicle implements SpeedCalculation {

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    public double calculateAllowedSpeed() {
        return this.maxSpeed * 0.6;
    }
}

class Car extends Vehicle implements SpeedCalculation {

    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    public double calculateAllowedSpeed() {
        return this.maxSpeed * 0.8;
    }
}
