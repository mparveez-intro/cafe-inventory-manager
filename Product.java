
public class Product {
    static int totalProducts = 0;
    String name;
    double price;
    int quantity;

    // 1. No-argument constructor: sets default values
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
        totalProducts++;
    }

    // 2. Parameterized constructor
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    // 3. Copy constructor
    Product(Product other) {
        this.name = other.name;
        this.price = other.price;
        this.quantity = other.quantity;
        totalProducts++;
        // TODO: copy name, price and quantity from other into this object
        // TODO: remember to increase totalProducts too
    }

    // price * quantity (the int quantity is widened to double automatically)
    double stockValue() {
        // TODO: return the total value of this product's stock
        return price * quantity;
    }

    void display() {
        // TODO: print one line, for example:  Samosa | Rs 15.0 | qty 20
        System.out.println(name + " | Rs " + price + " | qty " + quantity);
    }
}
