package model;

import java.util.Date;

public class Delivery {
    private int deliveryId;
    private String status;
    private Date deliveryTime;
    private int orderId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }



    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Override
    public String toString() {
        return "delivery{" +
                "deliveryId=" + deliveryId +
                ", status'" + status + '\'' +
                ", deliveryTime'" + deliveryTime + '\'' +
                ", orderId='" + orderId + '}';
    }

}
