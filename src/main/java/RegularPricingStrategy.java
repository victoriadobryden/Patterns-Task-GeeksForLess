public class RegularPricingStrategy implements PricingStrategy {
    double thisAmount = 0;
    @Override
    public double getCharge(int daysRented) {
        thisAmount += 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 0;
    }

    @Override
    public int setFrequentRenterPoints(int num) {
        return num;
    }
    // Implement methods for REGULAR movies
}

