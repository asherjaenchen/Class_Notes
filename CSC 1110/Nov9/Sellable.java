package Nov9;

public interface Sellable {
    //Attributes
    //static final attributes
    //must be public
    /**
     * Sell modifier for items.
     */
    double SELL_MODIFIER = 0.9;

    //abstract methods

    /**
     * Returns the price of the item.
     * @return Price of item.
     */
    double getPrice();

    /**
     * Displays the properties of the item.
     */
    void display();

    //static methods
    //default methods
}
