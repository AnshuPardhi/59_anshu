class Utility<T> {
    T value;

    Utility(T value) {
        this.value = value;
    }

    void print() {
        System.out.println("Value: " + value);
    }

    // Generic method
    public <E> void show(E data) {
        System.out.println("Generic Method: " + data);
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        Utility<String> strUtil = new Utility<>("Generics in Java");
        strUtil.print();
        strUtil.show(123);
        strUtil.show(56.78);
    }
}
