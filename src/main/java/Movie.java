public class Movie {
    private final String title;
    private final PricingStrategy pricingStrategy;

    public Movie(String title, PricingStrategy strategy) {
        this.title = title;
        this.pricingStrategy = strategy;
    }

    public double getCharge(int daysRented) {
        return pricingStrategy.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return pricingStrategy.getFrequentRenterPoints(daysRented);
    }

    public int setFrequentRenterPoints(int num) {
        return pricingStrategy.setFrequentRenterPoints(num);
    }

    public String getTitle() {
        return title;
    }
}