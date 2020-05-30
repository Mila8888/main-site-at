package ru.geekbraibs.main.site.at.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class ParametrizedExampleTest {

    @ParameterizedTest
    @MethodSource("stringGenerator")
    public void test01(String title) {
        assertNotNull(title);
    }

    public static Stream<String> stringGenerator() {
        return Stream.of("Courses", "Tests", "Blogs");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test02_data_source.csv", numLinesToSkip = 1)
    public void test02(int a, int b, int result) {
        assertEquals(result, a + b);
    }

    @ParameterizedTest
    @MethodSource("argumentStream")
    public void test03(int a, int b, int result) {
        assertEquals(result, a + b);
    }

    public static Stream<Arguments> argumentStream() {
        return Stream.of(
                Arguments.of(-100, 100, 0),
                Arguments.of(-1, 100, 99),
                Arguments.of(0, 100, 100)
        );
    }
}
