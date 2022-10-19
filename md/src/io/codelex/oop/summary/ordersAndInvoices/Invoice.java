package io.codelex.oop.summary.ordersAndInvoices;

import java.util.List;

public final class Invoice {

    private List<Object> items;
    private String invoiceNumber;
    private InvoiceStatus invoiceStatus = InvoiceStatus.APPROVED;
    private double price;
    private double priceVAT;

    public Invoice(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void send() {
        invoiceStatus = InvoiceStatus.SENT;
    }

    public String toString() {
        String invoiceNumb = "INVOICE NUMBER: ";
        String status = "STATUS: ";
        String sum = "SUM: ";
        String firstAndLastLine = "=".repeat(60);
        StringBuilder line = new StringBuilder();
/*
        for (int i = 0; i < Order.order.size(); i++) {
            line.append("= ").append(i + 1).append(". ").append(Order.order.get(i))
                    .append(" ".repeat(60 - Order.order.get(i).toString().length() - 6)).append("=\n");
        }
        return firstAndLastLine + "\n" +
                "= " + invoiceNumb + " ".repeat(60-invoiceNumb.length()-3) + "=\n"+
                "= " + status + " ".repeat(60-status.length()-3) + "=\n"+
                line +
                firstAndLastLine;
    }*/ return "";
    }
}
