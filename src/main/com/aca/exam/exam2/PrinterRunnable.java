package com.aca.exam.exam2;

import java.io.FileNotFoundException;

public class PrinterRunnable {
    FileSourceUserRepository userRepository;
    FileSourceOrderRepository orderRepository;

    public PrinterRunnable(FileSourceUserRepository userRepository, FileSourceOrderRepository orderRepository) throws FileNotFoundException {
        this.userRepository = userRepository;
        this.orderRepository= orderRepository;
    }

    public PrinterRunnable() {
    }
}
