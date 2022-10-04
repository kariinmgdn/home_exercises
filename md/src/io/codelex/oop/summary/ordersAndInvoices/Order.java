package io.codelex.oop.summary.ordersAndInvoices;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public static final List<Object> order = new ArrayList<>();
    public void addItem(Object item) {
        order.add(item);
    }

    public String toString() {
        return order.toString();
    }
}
