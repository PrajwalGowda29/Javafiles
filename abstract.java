abstract class Vehicle {
    abstract double speed();
    abstract double velocity();
}

class Car extends Vehicle {
    private double distance;
    private double time;
    private double displacement;

    Car(double distance, double time, double displacement) {
        this.distance = distance;
        this.time = time;
        this.displacement = displacement;
    }

    @Override
    double speed() {
        return distance / time;
    }

    @Override
    double velocity() {
        return displacement / time;
    }
}

public class Main {
    public static void main(String[] args) {

        // ✅ Create object of Car
        Car car = new Car(100, 2, 60);

        System.out.println("Speed: " + car.speed());
        System.out.println("Velocity: " + car.velocity());
    }
}
