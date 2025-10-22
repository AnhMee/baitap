import java.util.ArrayList;

public class Order {
    private String orderId;
    private ArrayList<OrderItem> items;

    public Order(String orderId) {
        this.orderId = orderId;
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    // Tính tổng tiền của cả đơn hàng
    public double getTotalAmount() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Order ID: " + orderId);
        for (OrderItem item : items) {
            item.printInfo();
        }
        System.out.println("Tổng tiền đơn hàng: " + getTotalAmount());
    }
}
