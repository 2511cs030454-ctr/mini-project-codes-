import java.util.ArrayList;

public class EcommerceArrayList {
    public static void main(String[] args) {

        // Create Product List
        ArrayList<String> products = new ArrayList<>();

        // 1. Add Elements
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Smart Watch");

        System.out.println("Products: " + products);

        // 2. Add Elements from Another ArrayList
        ArrayList<String> newProducts = new ArrayList<>();
        newProducts.add("Keyboard");
        newProducts.add("Mouse");

        products.addAll(newProducts);

        System.out.println("\nAfter addAll(): " + products);

        // 3. Access Elements
        System.out.println("\nFirst Product: " + products.get(0));
        System.out.println("Third Product: " + products.get(2));

        // 4. Remove Elements
        products.remove("Mobile");   // Remove by value
        products.remove(0);          // Remove by index

        System.out.println("\nAfter remove(): " + products);

        // 5. Check Contents
        System.out.println("\nContains 'Mouse'? " + products.contains("Mouse"));
        System.out.println("Contains 'Laptop'? " + products.contains("Laptop"));

        // 6. Index Of Element
        System.out.println("\nIndex of Keyboard: " + products.indexOf("Keyboard"));
        System.out.println("Index of Smart Watch: " + products.indexOf("Smart Watch"));

        // Display Final List
        System.out.println("\nFinal Product List:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}