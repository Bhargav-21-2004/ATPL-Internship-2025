import java.util.*;
import java.util.function.*;

public class ProductDiscount {
    public static void main(String[] args) {
        Map<String, Optional<Double>> products = new HashMap<>();
            products.put("Laptop", Optional.of(50000.0));
            products.put("Mouse", Optional.of(1000.0));
            products.put("Tablet", Optional.empty());
        Function<Double, Double> applyDiscount = price -> price * 0.9;
        products.forEach((name, optprice) -> {
            double finalPrice = optprice.map(applyDiscount).orElse(0.0);
            System.out.println(name + " final price: " + finalPrice);
        });
    }
}
