public class OrderItem {
    private int menuItemID;
    private String itemName;
    private int quantity;
    private double price;

    public OrderItem(int menuItemID, String itemName, int quantity, double price) {
        this.menuItemID = menuItemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters...
}
