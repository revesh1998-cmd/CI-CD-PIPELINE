package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddition() {
        App app = new App();

        assertEquals(10, app.add(4, 6));
    }
}
