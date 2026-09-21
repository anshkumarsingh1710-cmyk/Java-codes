import java.util.*;

class Product {
    private String id;
    private String name;
    private double price;

    Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        if (price <= 0) {
            System.out.println("Invalid Product Price");
            return;
        }

        System.out.println("Product ID = " + id);
        System.out.println("Product Name = " + name);
        System.out.println("Price = " + price);
    }
}

public class exp5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();

        Product p = new Product(id, name, price);
        p.display();
    }
}