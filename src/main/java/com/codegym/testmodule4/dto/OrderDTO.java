package com.codegym.testmodule4.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderDTO {

    private Long orderId;
    private String productName;
    private double price;
    private String status;
    private String orderDate;
    private int quantity;
    private double totalPrice;

    // Constructor
    public OrderDTO(Long orderId, String productName, double price, String status, LocalDateTime orderDate, int quantity, double totalPrice) {
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
        this.status = status;
        this.orderDate = formatDate(orderDate); // Chuyển đổi LocalDateTime thành String ngày
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    // Phương thức để định dạng LocalDateTime thành String ngày
    private String formatDate(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dateTime.toLocalDate().format(formatter);
    }

    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }
}
