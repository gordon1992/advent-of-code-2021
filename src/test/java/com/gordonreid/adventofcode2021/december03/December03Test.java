package com.gordonreid.adventofcode2021.december03;

import com.gordonreid.adventofcode2021.helpers.FileHelpers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class December03Test {

    private static List<String> EXAMPLE_INPUT;
    private static List<String> ACTUAL_INPUT;

    @BeforeAll
    public static void setup() throws Exception {
        EXAMPLE_INPUT = FileHelpers.getResourceLines("day-3-test-input");
        ACTUAL_INPUT = FileHelpers.getResourceLines("day-3-input");
    }

    @Test
    public void part1_given_example() {
        int expectedResult = 198;

        int actualResult = Part1.run(EXAMPLE_INPUT);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void part1_actual() {
        int expectedResult = 3923414;

        int actualResult = Part1.run(ACTUAL_INPUT);

        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void part2_given_example() {
        int expectedResult = 230;

        int actualResult = Part2.run(EXAMPLE_INPUT);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void part2_actual() {
        int expectedResult = 5852595;

        int actualResult = Part2.run(ACTUAL_INPUT);

        assertEquals(expectedResult, actualResult);
    }
}