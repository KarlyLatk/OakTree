package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquirrelTest {
    @Test
    public void testGetName() {
        Squirrel  squirrel = new Squirrel("Squirrel");
        assertEquals(squirrel.getName(), "Squirrel");
    }
}
