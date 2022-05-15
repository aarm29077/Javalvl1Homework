package com.aca.homework.week10.entry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntryImplTest {
    Entry<Integer, String> entry;

    @BeforeEach
    public void SetUp() {
        entry = new EntryImpl("text", 10);
    }

    @Test
    public void testFirstArgument() {
        Assertions.assertEquals("text", entry.key());
    }

    @Test
    public void testSecondArgument() {
        Assertions.assertEquals(10, entry.value());
    }

}