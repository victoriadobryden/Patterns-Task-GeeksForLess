public class ChildrenPricingStrategy implements PricingStrategy {
    double thisAmount = 0;
    @Override
    public double getCharge(int daysRented) {
        thisAmount += 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
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
    // Implement methods for CHILDRENS movies
}
