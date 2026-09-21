import java.util.*;

class Product {
    String id, name;
    double price;

    Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
    }
}

class Electronics extends Product {
    Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    void display() {
        System.out.println("Electronics Product Displayed");
        System.out.println("Name = " + name);
        System.out.println("Price = " + price);
    }
}

class HomeAppliance extends Product {
    HomeAppliance(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    void display() {
        System.out.println("Home Appliance Product Displayed");
        System.out.println("Name = " + name);
        System.out.println("Price = " + price);
    }
}

public class exp5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        String id = sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();

        if (price <= 0) {
            System.out.println("Invalid Product Price");
            return;
        }

        Product p;

        if (type.equalsIgnoreCase("Electronics"))
            p = new Electronics(id, name, price);
        else
            p = new HomeAppliance(id, name, price);

        p.display();
    }
}