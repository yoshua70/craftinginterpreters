package com.craftinginterpreters.lox;

import org.junit.jupiter.api.Test;

import com.craftinginterpreters.lox.App;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
