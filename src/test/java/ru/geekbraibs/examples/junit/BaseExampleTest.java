package ru.geekbraibs.examples.junit;

import org.junit.jupiter.api.*;

    @Disabled
    public class BaseExampleTest {

        @BeforeAll
        static void beforeAll() {
            System.out.println("Base class before all");
        }

        @BeforeEach
        void setUp() {
            System.out.println("Base class before each");

        }

        @AfterEach
        void tearDown() {
            System.out.println("Base class after each");

        }

        @AfterAll
        static void afterAll() {
            System.out.println("Base class after all");
        }
    }

