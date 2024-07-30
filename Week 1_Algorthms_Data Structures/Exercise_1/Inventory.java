import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private HashMap<String, Product> inventory = new HashMap<>();

    // Adding product to inventory
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    // Deleting product from inventory
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }
    
    // Get the product based on ID
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }
    // Print the whole inventory
    public void printInventory() {
        for (Map.Entry<String, Product> entry : inventory.entrySet()) {
            Product product = entry.getValue();
            System.out.println("ProductId: " + product.productId + "\n" + 
                               "ProductName: " + product.productName + "\n" + 
                               "Quantity: " + product.quantity + "\n" + 
                               "Price: " + product.price);
        }
    }
    public static void main(String[] args) {
        // Example implementation
        // init a inventory
        Inventory ims = new Inventory();
        // Creating products
        Product prod1 = new Product("1", "Product1", 100, 29.99);
        Product prod2 = new Product("2", "Product2", 100, 29.99);
        // adding to inventory
        ims.addProduct(prod1);
        ims.addProduct(prod2);
        // updating product
        ims.getProduct("2").setPrice(300);
        // deleting product
        ims.deleteProduct("1");

        // Printing out the inventory
        ims.printInventory();
    }
}

