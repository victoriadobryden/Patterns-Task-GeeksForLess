public class NewReleasePricingStrategy implements PricingStrategy {
    double thisAmount = 0;

    @Override
    public double getCharge(int daysRented) {
        thisAmount += daysRented * 3;
        return thisAmount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 0;
    }

    @Override
    public int setFrequentRenterPoints(int num) {
        return num++;
    }
    // Implement methods for NEW_RELEASE movies
}
