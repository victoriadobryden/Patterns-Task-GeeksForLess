import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Rental> rentals = List.of(new Rental(new Movie("Rambo", new RegularPricingStrategy()), 1),
                new Rental(new Movie("Lord of the Rings", new NewReleasePricingStrategy()), 4),
                new Rental(new Movie("Harry Potter", new ChildrenPricingStrategy()), 5));

        Customer customer = new Customer("John Doe", rentals);
        customer.printingGeneral();
    }
}