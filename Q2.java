class Product {
    String name;
    double price;

    // Constructor 1
    Product(String name) {
        this.name = name;
        this.price = 0.0;
    }

    // Constructor 2 (overloaded)
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void show() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook");
        Product p2 = new Product("Laptop", 59999.99);
        p1.show();
        p2.show();
    }
}
