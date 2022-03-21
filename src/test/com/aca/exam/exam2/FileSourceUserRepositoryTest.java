package com.aca.exam.exam2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class FileSourceUserRepositoryTest {
    private FileSourceUserRepository fileSourceUserRepository;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        fileSourceUserRepository = FileSourceUserRepository.getInstance();
    }

    @Test
    void testGetInstance() throws FileNotFoundException {
        FileSourceUserRepository fileSourceUserRepository2 = FileSourceUserRepository.getInstance();
        Assertions.assertEquals(fileSourceUserRepository2, fileSourceUserRepository);
    }

    @Test
    void testFindByIdWhenIdIsNotFound() {
        Assertions.assertEquals(null, fileSourceUserRepository.findById("lkjhgfd"));
    }

    @Test
    void testFindByIdWhenIdIsFound() {
        Assertions.assertEquals(fileSourceUserRepository.getUsersList().get(7), fileSourceUserRepository.findById("barracudaassign"));
    }

    @Test
    void testFindAll() {
        Assertions.assertEquals(fileSourceUserRepository.getUsersList(), fileSourceUserRepository.findAll());
    }

}