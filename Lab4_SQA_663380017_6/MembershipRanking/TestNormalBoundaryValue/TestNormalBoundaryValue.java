package TestNormalBoundaryValue;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//	import org.junit.jupiter.params.ParameterizedTest;
//	import org.junit.jupiter.params.provider.ValueSource;

import sqa.main.Ranking;

public class TestNormalBoundaryValue {
	
	Ranking ranking = new Ranking();
	
	@Test
	@DisplayName("TC01 Expected result = Standard, purchaseTotal = 10000(min), frequency = 1(min), pointCollected = 100(min)")
	void testcase_01() {
		String result = ranking.CalculateMembershipRank(10000, 1, 100);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC02 Expected result = Silver, purchaseTotal = 10000(min), frequency = 4(nom), pointCollected = 500(nom)")
	void testcase_02() {
		String result = ranking.CalculateMembershipRank(10000, 4, 500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC03 Expected result = Silver, purchaseTotal = 99999(max-), frequency = 4(nom), pointCollected = 999(max-)")
	void testcase_03() {
		String result = ranking.CalculateMembershipRank(99999, 4, 999);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC04 Expected result = Silver, purchaseTotal = 10000(min), frequency = 2(min+), pointCollected = 100(min)")
	void testcase_04() {
		String result = ranking.CalculateMembershipRank(10000, 2, 100);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC05 Expected result = Silver, purchaseTotal = 10001(min+), frequency = 2(min+), pointCollected = 100(min)")
	void testcase_05() {
		String result = ranking.CalculateMembershipRank(10000, 2, 100);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC06 Expected result = Silver, purchaseTotal = 50000(nom), frequency = 4(nom), pointCollected = 500(nom)")
	void testcase_06() {
		String result = ranking.CalculateMembershipRank(50000, 4, 500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC07 Expected result = Gold, purchaseTotal = 50000(nom), frequency = 1(min), pointCollected = 500(nom)")
	void testcase_07() {
		String result = ranking.CalculateMembershipRank(50000, 1, 500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC08 Expected result = Gold, purchaseTotal = 50000(nom), frequency = 6(max-), pointCollected = 500(nom)")
	void testcase_08() {
		String result = ranking.CalculateMembershipRank(50000, 6, 500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC09 Expected result = Gold, purchaseTotal = 99999(max-), frequency = 7(max), pointCollected = 999(max-)")
	void testcase_09() {
		String result = ranking.CalculateMembershipRank(99999, 7, 999);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC10 Expected result = Platinum, purchaseTotal = 100000(max), frequency = 6(max-), pointCollected = 1000(max)")
	void testcase_10() {
		String result = ranking.CalculateMembershipRank(100000, 6, 1000);
		assertEquals("Platinum", result);
	}
	
	@Test
	@DisplayName("TC11 Expected result = Platinum, purchaseTotal = 100000(max), frequency = 7(max), pointCollected = 1000(max)")
	void testcase_11() {
		String result = ranking.CalculateMembershipRank(100000, 7, 1000);
		assertEquals("Platinum", result);
	}
	
	@Test
	@DisplayName("TC12 Expected result = Gold, purchaseTotal = 100000(max), frequency = 4(nom), pointCollected = 1000(max)")
	void testcase_12() {
		String result = ranking.CalculateMembershipRank(100000, 4, 1000);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC13 Expected result = Gold, purchaseTotal = 100000(max), frequency = 6(max-), pointCollected = 999(max-)")
	void testcase_13() {
		String result = ranking.CalculateMembershipRank(100000, 6, 999);
		assertEquals("Gold", result);
	}
}
