public class OrderItem {
    private String productName;
    private int quantity;
    private double price; // giá 1 sản phẩm

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Tính thành tiền cho từng OrderItem
    public double getTotalPrice() {
        return quantity * price;
    }

    public void printInfo() {
        System.out.println(productName + " x " + quantity + " = " + getTotalPrice() + " VND");
    }
}
