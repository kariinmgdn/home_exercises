package io.codelex.oop.summary.ordersAndInvoices;

public final class Invoice {

    private final Order items;
    private final String invoiceNumber;
    private InvoiceStatus  invoiceStatus = InvoiceStatus.APPROVED;

    // CENA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // IN GENERAL ARII VISS PAREJAIS LMAO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private double priceWithoutVAT;
    private double priceWithVAT;

    public Invoice(Order items, String invoiceNumber) {
        this.items = items;
        this.invoiceNumber = invoiceNumber;
    }

    public void send() {
        invoiceStatus = InvoiceStatus.SENT;
    }

    public String toString() {
        String invoiceNumb = "INVOICE NUMBER: " + getInvoiceNumber();
        String status = "STATUS: " + getInvoiceStatus();
        String sum = "SUM: ";
        String firstAndLastLine = "=".repeat(60);
        StringBuilder line = new StringBuilder();

        for (int i = 0; i < Order.order.size(); i++) {
            line.append("= ").append(i + 1).append(". ").append(Order.order.get(i)).append(" ".repeat(60 - Order.order.get(i).toString().length() - 6)).append("=\n");
        }
        return firstAndLastLine + "\n" +
                "= " + invoiceNumb + " ".repeat(60-invoiceNumb.length()-3) + "=\n"+
                "= " + status + " ".repeat(60-status.length()-3) + "=\n"+
                line +
                firstAndLastLine;
    }



    public Order getItems() {
        return items;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public double getPriceWithoutVAT() {
        return priceWithoutVAT;
    }

    public double getPriceWithVAT() {
        return priceWithVAT;
    }
}
