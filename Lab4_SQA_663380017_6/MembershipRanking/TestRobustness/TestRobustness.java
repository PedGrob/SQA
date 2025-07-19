package TestRobustness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sqa.main.Ranking;

public class TestRobustness {
	
	Ranking ranking = new Ranking();
	
	@Test
	@DisplayName("TC01 Expected result = Standard, purchaseTotal = 9999(min-), frequency = 4(nom) , pointCollected = 500(nom)")
	void testcase_01() {
		String result = ranking.CalculateMembershipRank(9999, 4, 500);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC02 Expected result = Standard, purchaseTotal = 50000(nom), frequency = 0(min-) , pointCollected = 500(nom)")
	void testcase_02() {
		String result = ranking.CalculateMembershipRank(50000, 0, 500);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC03 Expected result = Standard, purchaseTotal = 50000(nom), frequency = 4(nom) , pointCollected = 99(min-)")
	void testcase_03() {
		String result = ranking.CalculateMembershipRank(50000, 4, 99);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC04 Expected result = Standard, purchaseTotal = 9999(min-), frequency = 4(nom) , pointCollected = 99(min)")
	void testcase_04() {
		String result = ranking.CalculateMembershipRank(9999, 4, 99);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC05 Expected result = Platinum, purchaseTotal = 100001(max+), frequency = 6(max-) , pointCollected = 1000(max)")
	void testcase_05() {
		String result = ranking.CalculateMembershipRank(100001, 6, 1000);
		assertEquals("Platinum", result);
	}
	
	@Test
	@DisplayName("TC06 Expected result = Gold, purchaseTotal = 100000(max), frequency = 8(max+) , pointCollected = 1000(max)")
	void testcase_06() {
		String result = ranking.CalculateMembershipRank(100000, 8, 1000);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC07 Expected result = Platinum, purchaseTotal = 100000(max), frequency = 6(max-) , pointCollected = 1001(max+)")
	void testcase_07() {
		String result = ranking.CalculateMembershipRank(100000, 6, 1001);
		assertEquals("Platinum", result);
	}
	
	@Test
	@DisplayName("TC08 Expected result = Gold, purchaseTotal = 100001(max+), frequency = 8(max+) , pointCollected = 1001(max+)")
	void testcase_08() {
		String result = ranking.CalculateMembershipRank(100001, 8, 1001);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC09 Expected result = Standard, purchaseTotal = 9999(min-), frequency = 2(min+) , pointCollected = 100(min)")
	void testcase_09() {
		String result = ranking.CalculateMembershipRank(9999, 2, 100);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC10 Expected result = Standard, purchaseTotal = 10000(min), frequency = 0(min-) , pointCollected = 100(min)")
	void testcase_10() {
		String result = ranking.CalculateMembershipRank(10000, 0, 100);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC11 Expected result = Standard, purchaseTotal = 10000(min), frequency = 2(min+) , pointCollected = 99(min-)")
	void testcase_11() {
		String result = ranking.CalculateMembershipRank(9999, 2, 100);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC12 Expected result = Gold, purchaseTotal = 50000(nom), frequency = 4(nom) , pointCollected = 1001(max+)")
	void testcase_12() {
		String result = ranking.CalculateMembershipRank(50000, 4, 1001);
		assertEquals("Gold", result);
	}


}
