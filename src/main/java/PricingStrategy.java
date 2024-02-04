public interface PricingStrategy {
    double getCharge(int daysRented);
    int getFrequentRenterPoints(int daysRented);
    int setFrequentRenterPoints(int num);
}
