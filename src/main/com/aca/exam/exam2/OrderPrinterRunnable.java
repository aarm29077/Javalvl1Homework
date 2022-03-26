package com.aca.exam.exam2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class OrderPrinterRunnable extends PrinterRunnable implements Runnable {
    private int id;

    public OrderPrinterRunnable(int id)  {

        this.id = id;
    }

    @Override
    public void run() {
        for (Order orders : orderRepository.getOrderedList()) {
            if (orders.getId() == id) {
                System.out.println(orders);
            }
        }
    }

    public void printList() {
        List<OrderPrinterRunnable> orderPrinterRunnables = new ArrayList<>();
        orderPrinterRunnables.add((OrderPrinterRunnable) orderRepository.getOrderedList());
        for (OrderPrinterRunnable orderPrinterRunnable : orderPrinterRunnables) {
            System.out.println(orderPrinterRunnable);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        OrderPrinterRunnable orderPrinterRunnable = new OrderPrinterRunnable(5);
        orderPrinterRunnable.run();

    }
}

