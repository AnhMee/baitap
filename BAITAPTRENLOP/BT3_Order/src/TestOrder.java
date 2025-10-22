public class TestOrder {
    public static void main(String[] args) {
        Order order = new Order("DH001");

        // Một Order chứa nhiều OrderItem
        order.addItem(new OrderItem("Táo", 3, 20000));
        order.addItem(new OrderItem("Cam", 4, 30000));
        order.addItem(new OrderItem("Nho", 1, 50000));
        order.addItem(new OrderItem("Xoài", 3, 70000));

        // In thông tin đơn hàng
        order.printOrder();
    }
}
