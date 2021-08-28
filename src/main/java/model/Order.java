package model;

public class Order {
    private int orderId;
    private String orderStatus;
    private String orderDate;
    private int customerId;
    private int paymentId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrder_id(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }



    @Override
    public String toString() {
        return "order{" +
                "orderId=" + orderId +
                ", orderStatus'" + orderStatus + '\'' +
                ", orderDate'" + orderDate+ '\'' +
                ", customer='" + customerId +
                ", paymentId='" + paymentId + '}';
    }
}
