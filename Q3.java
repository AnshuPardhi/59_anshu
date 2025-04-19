class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Bike runs at 80 km/h");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.move();  // From parent class
        b.speed(); // From child class
    }
}
