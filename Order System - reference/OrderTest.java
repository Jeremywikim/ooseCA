import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testAddItemToOrder() {
        Order order = new Order();
        OrderItem item = new OrderItem(1, "Burger", 2, 10.0);

        order.addItem(item);

        assertEquals(1, order.getOrderItems().size());
    }

    @Test
    public void testCalculateTotalAmount() {
        Order order = new Order();
        OrderItem item1 = new OrderItem(1, "Burger", 2, 10.0);
        OrderItem item2 = new OrderItem(2, "Fries", 1, 5.0);

        order.addItem(item1);
        order.addItem(item2);

        assertEquals(25.0, order.calculateTotalAmount());
    }

    @Test
    public void testAddNonExistingItem() {
        Order order = new Order();
        Menu menu = new Menu();
        menu.addItem("Burger", 10.0);
        menu.addItem("Fries", 5.0);

        order.setMenu(menu);

        // Attempt to add a non-existing item to the order
        OrderItem nonExistingItem = new OrderItem(3, "Drink", 1, 3.0);
        order.addItem(nonExistingItem);

        // Verify that the order remains unchanged
        assertEquals(0, order.getOrderItems().size());
        // Verify that the total amount is still 0.0
        assertEquals(0.0, order.calculateTotalAmount());
    }

    // Add more test cases for different scenarios
}
