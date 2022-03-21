package com.aca.exam.exam2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class FileSourceOrderRepositoryTest {
    private FileSourceOrderRepository orderRepository;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        orderRepository = new FileSourceOrderRepository(new FileSourceUserRepository());
    }

    @Test
    void testFindByIdWhenIdIsNotFound() {
        Assertions.assertEquals(null, orderRepository.findById(654));
    }

    @Test
    void testFindByIdWhenIdIsFound() {
        Assertions.assertEquals(orderRepository.getOrderedList().get(8), orderRepository.findById(9));
    }

    @Test
    void testFindAllSize() throws FileNotFoundException {
        Assertions.assertEquals(9, orderRepository.findAll().size());
    }

    @Test
    void testFindAllByUserId() {
        Assertions.assertEquals(orderRepository.getOrderedList().get(4), orderRepository.findAllByUserId("shawlinspire").get(0));
    }
}