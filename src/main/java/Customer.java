import java.util.List;

@SuppressWarnings("StringConcatenationInLoop")
class Customer {
    private final String name;
    private final List<Rental> rentals;

    public void setFrequentRenterPoints(int frequentRenterPoints) {
        this.frequentRenterPoints = frequentRenterPoints;
    }

    int frequentRenterPoints = 0;

    public double getTotalAmount() {
        return totalAmount;
    }

    double totalAmount = 0;

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public void printingGeneral() {
        System.out.println("Rental Record for " + getName() + "\n");
        statement();
        System.out.println("Amount owed is " + getTotalAmount() + "\n");
        System.out.println("You earned " + getFrequentRenterPoints() + " frequent renter points");
    }

    private void statement() {
        for (Rental each : rentals) {
            System.out.println("\t" + each.getMovie().getTitle() + "\t" + each.counting() + "\n");
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            //if ((each.getMovie().getPricingStrategy() == NewReleasePricingStrategy) && each.getDaysRented() > 1)
                //frequentRenterPoints++;
            //show figures for this rental
            each.getMovie().setFrequentRenterPoints(frequentRenterPoints);
            totalAmount += each.counting();
        }
    }
}
