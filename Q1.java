class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2022;
        car1.displayInfo();
    }
}
