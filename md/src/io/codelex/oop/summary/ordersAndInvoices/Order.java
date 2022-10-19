package io.codelex.oop.summary.ordersAndInvoices;

import java.util.List;

public class Order {
    private List<Object> order;

    public Order(List<Object> order) {
        this.order = order;
    }

    public void addItem(Object item) {
        order.add(item);
    }

    public String toString() {
        return order.toString();
    }

    public List<Object> getOrder() {
        return order;
    }
}
