import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Smartphone", "Electronics"),
            new Product(4, "Book", "Education"),
            new Product(5, "Watch", "Accessories")
        };

        String searchTerm1 = "Smartphone";
        Product result1 = SearchUtil.linearSearch(products, searchTerm1);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Arrays.sort(products, Comparator.comparing(p -> p.productName));
        String searchTerm2 = "Book";
        Product result2 = SearchUtil.binarySearch(products, searchTerm2);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}