import java.util.Scanner;

class Product {

    // Private data members
    private int productId;
    private double price;

    // Setter for product ID
    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Getter for product ID
    public int getProductId() {
        return productId;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}

public class exp4_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        p.setProductId(id);
        p.setPrice(price);

        System.out.println("\nProduct Record Created");
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Price: " + p.getPrice());

        // Updating price
        System.out.print("\nEnter Updated Price: ");
        double newPrice = sc.nextDouble();

        p.setPrice(newPrice);

        System.out.println("Product Record Updated");
        System.out.println("Updated Price: " + p.getPrice());

        sc.close();
    }
}