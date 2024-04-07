// RewardValue Class - Represents correspondence btw currencies (cash, miles, etc...)
public class RewardValue {
    private final double cashValues;
    private final int milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // converting from cash to miles
    public RewardValue(double cashValues) {
        this.cashValues = cashValues;
        this.milesValue = (int) (cashValues / MILES_TO_CASH_CONVERSION_RATE);
    }

    // converting from miles to cash
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValues = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Getter for the cash values
    public double getCashValue() {
        return this.cashValues;
    }

    // Getter for the miles values
    public int getMilesValue() {
        return this.milesValue;
    }
}
