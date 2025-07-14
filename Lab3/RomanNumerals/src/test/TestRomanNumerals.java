package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestRomanNumerals {
	
	// TC01: Roman = I, Expected result = 1
	@Test
	void testSingleDigit_I() {
		assertEquals(1, new RomanNumerals().convertRomanNumToInt("I"));
	}
	// TC02: Roman = V, Expected result = 5
	@Test
	void testSingleDigit_V() {
		assertEquals(5, new RomanNumerals().convertRomanNumToInt("V"));
	}
	// TC03: Roman = IV, Expected result = 4
	@Test
	void testTwoDigit_IV() {
		assertEquals(4, new RomanNumerals().convertRomanNumToInt("IV"));
	}
	// TC04: Roman = IX, Expected result = 9
	@Test
	void testTwoDigit_IX() {
		assertEquals(9, new RomanNumerals().convertRomanNumToInt("IX"));
	}
	// TC05: Roman = VI, Expected result = 6
	@Test
	void testTwoDigit_VI() {
		assertEquals(6, new RomanNumerals().convertRomanNumToInt("VI"));
	}
	@Test
	// TC06: Roman = II, Expected result = 2
	void testTwoDigit_II() {
		assertEquals(2, new RomanNumerals().convertRomanNumToInt("II"));
	}
	@Test
	// TC07: Roman = III, Expected result = 3
	void testMultipleDigit_III() {
		assertEquals(3, new RomanNumerals().convertRomanNumToInt("III"));
	}
	@Test
	// TC08: Roman = XXVI, Expected result = 26
	void testMultipleDigit_XXVI() {
		assertEquals(26, new RomanNumerals().convertRomanNumToInt("XXVI"));
	}
	@Test
	// TC09: Roman = LXXIV, Expected result = 74
	void testMultipleDigit_LXXIV() {
		assertEquals(74, new RomanNumerals().convertRomanNumToInt("LXXIV"));
	}
	@Test
	// TC10: Roman = J, Expected result = NullPointerException
	void testNotRomanNum() {
		assertThrows(NullPointerException.class, () -> {
			new RomanNumerals().convertRomanNumToInt("J");
		});
	}
	@Test
	// TC11: Roman = VV, Expected result != 10
	void testWrongrepeating() {
		assertNotEquals(10, new RomanNumerals().convertRomanNumToInt("VV"));
	}
	@Test
	// TC12: Roman = XXXX, Expected result != 40
	void testMoreThreeRomanNum() {
		assertNotEquals(40, new RomanNumerals().convertRomanNumToInt("XXXX"));
	}
}
