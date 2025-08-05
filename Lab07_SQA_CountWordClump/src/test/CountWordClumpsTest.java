package test;

import org.junit.jupiter.api.Test;

import sqa.main.CountWordClumps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CountWordClumpsTest {

    @Test
    void testTC01_NullInput() {
        assertEquals(0, CountWordClumps.countClumps(null));
    }

    @Test
    void testTC02_EmptyArray() {
        assertEquals(0, CountWordClumps.countClumps(new int[]{}));
    }

    @Test
    void testTC03_SingleElement() {
        assertEquals(0, CountWordClumps.countClumps(new int[]{1}));
    }

    @Test
    void testTC04_OneClump_TwoElements() {
        assertEquals(1, CountWordClumps.countClumps(new int[]{1, 1}));
    }

    @Test
    void testTC05_OneClump_ThreeElements() {
        assertEquals(1, CountWordClumps.countClumps(new int[]{1, 1, 1}));
    }
}