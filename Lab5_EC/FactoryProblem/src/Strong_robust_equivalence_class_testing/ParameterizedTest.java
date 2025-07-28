package Strong_robust_equivalence_class_testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import sqa.main.Income;

public class ParameterizedTest {

	private Income incomeCalculator;

    @BeforeEach
    void setUp() {
        // สร้าง instance ใหม่ของคลาส Income ก่อนรันแต่ละเทส
        incomeCalculator = new Income();
    }

    @Nested
    @DisplayName("Valid Equivalence Class Test Cases")
    class ValidTestCases {
    	
    	 @Test
         @DisplayName("VEC-01 - Valid Input: Happy Path with Mid-Range Values")
         void testcase_VEC01_happyPathMidValues() {
             // Input: ใบพัด=3000, มอเตอร์=550, กระจัง=1750 (ค่ากลาง)
             // Expected: (3000*10) + (550*30) + (1750*20) = 81500.0
             Double result = incomeCalculator.calculateIncome(3000, 550, 1750);
             assertEquals(81500.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-02 - Valid Input: Impeller at Minimum (1000)")
         void testcase_VEC02_impellerMin() {
             // Input: ใบพัด=1000, มอเตอร์=550, กระจัง=1750
             // Expected: (1000*10) + (550*30) + (1750*20) = 61500.0
             Double result = incomeCalculator.calculateIncome(1000, 550, 1750);
             assertEquals(61500.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-03 - Valid Input: Impeller at Min+1 (1001)")
         void testcase_VEC03_impellerMinPlusOne() {
             // Input: ใบพัด=1001, มอเตอร์=550, กระจัง=1750
             // Expected: (1001*10) + (550*30) + (1750*20) = 61510.0
             Double result = incomeCalculator.calculateIncome(1001, 550, 1750);
             assertEquals(61510.0, result, 0.001);
         }
         
         @Test
         @DisplayName("VEC-04 - Valid Input: Impeller at Max-1 (4999)")
         void testcase_VEC04_impellerMaxMinusOne() {
             // Input: ใบพัด=4999, มอเตอร์=550, กระจัง=1750
             // Expected: (4999*10) + (550*30) + (1750*20) = 101490.0
             Double result = incomeCalculator.calculateIncome(4999, 550, 1750);
             assertEquals(101490.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-05 - Valid Input: Impeller at Maximum (5000)")
         void testcase_VEC05_impellerMax() {
             // Input: ใบพัด=5000, มอเตอร์=550, กระจัง=1750
             // Expected: (5000*10) + (550*30) + (1750*20) = 101500.0
             Double result = incomeCalculator.calculateIncome(5000, 550, 1750);
             assertEquals(101500.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-06 - Valid Input: Motor at Minimum (300)")
         void testcase_VEC06_motorMin() {
             // Input: ใบพัด=3000, มอเตอร์=300, กระจัง=1750
             // Expected: (3000*10) + (300*30) + (1750*20) = 74000.0
             Double result = incomeCalculator.calculateIncome(3000, 300, 1750);
             assertEquals(74000.0, result, 0.001);
         }
         
         @Test
         @DisplayName("VEC-07 - Valid Input: Motor at Min+1 (301)")
         void testcase_VEC07_motorMinPlusOne() {
             // Input: ใบพัด=3000, มอเตอร์=301, กระจัง=1750
             // Expected: (3000*10) + (301*30) + (1750*20) = 74030.0
             Double result = incomeCalculator.calculateIncome(3000, 301, 1750);
             assertEquals(74030.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-08 - Valid Input: Motor at Max-1 (799)")
         void testcase_VEC08_motorMaxMinusOne() {
             // Input: ใบพัด=3000, มอเตอร์=799, กระจัง=1750
             // Expected: (3000*10) + (799*30) + (1750*20) = 88970.0
             Double result = incomeCalculator.calculateIncome(3000, 799, 1750);
             assertEquals(88970.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-09 - Valid Input: Motor at Maximum (800)")
         void testcase_VEC09_motorMax() {
             // Input: ใบพัด=3000, มอเตอร์=800, กระจัง=1750
             // Expected: (3000*10) + (800*30) + (1750*20) = 89000.0
             Double result = incomeCalculator.calculateIncome(3000, 800, 1750);
             assertEquals(89000.0, result, 0.001);
         }
         
         @Test
         @DisplayName("VEC-10 - Valid Input: Cover at Minimum (500)")
         void testcase_VEC10_coverMin() {
             // Input: ใบพัด=3000, มอเตอร์=550, กระจัง=500
             // Expected: (3000*10) + (550*30) + (500*20) = 56500.0
             Double result = incomeCalculator.calculateIncome(3000, 550, 500);
             assertEquals(56500.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-11 - Valid Input: Cover at Min+1 (501)")
         void testcase_VEC11_coverMinPlusOne() {
             // Input: ใบพัด=3000, มอเตอร์=550, กระจัง=501
             // Expected: (3000*10) + (550*30) + (501*20) = 56520.0
             Double result = incomeCalculator.calculateIncome(3000, 550, 501);
             assertEquals(56520.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-12 - Valid Input: Cover at Max-1 (2999)")
         void testcase_VEC12_coverMaxMinusOne() {
             // Input: ใบพัด=3000, มอเตอร์=550, กระจัง=2999
             // Expected: (3000*10) + (550*30) + (2999*20) = 106480.0
             Double result = incomeCalculator.calculateIncome(3000, 550, 2999);
             assertEquals(106480.0, result, 0.001);
         }
         
         @Test
         @DisplayName("VEC-13 - Valid Input: Cover at Maximum (3000)")
         void testcase_VEC13_coverMax() {
             // Input: ใบพัด=3000, มอเตอร์=550, กระจัง=3000
             // Expected: (3000*10) + (550*30) + (3000*20) = 106500.0
             Double result = incomeCalculator.calculateIncome(3000, 550, 3000);
             assertEquals(106500.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-14 - Valid Input: All at Minimum Boundary")
         void testcase_VEC14_allMinBoundary() {
             // Input: ใบพัด=1000, มอเตอร์=300, กระจัง=500
             // Expected: (1000*10) + (300*30) + (500*20) = 29000.0
             Double result = incomeCalculator.calculateIncome(1000, 300, 500);
             assertEquals(29000.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-15 - Valid Input: All at Maximum Boundary")
         void testcase_VEC15_allMaxBoundary() {
             // Input: ใบพัด=5000, มอเตอร์=800, กระจัง=3000
             // Expected: (5000*10) + (800*30) + (3000*20) = 134000.0
             Double result = incomeCalculator.calculateIncome(5000, 800, 3000);
             assertEquals(134000.0, result, 0.001);
         }

         @Test
         @DisplayName("VEC-16 - Valid Input: Combination of Boundaries")
         void testcase_VEC16_combinationBoundary() {
             // Input: ใบพัด=1000 (Min), มอเตอร์=800 (Max), กระจัง=1750 (Mid)
             // Expected: (1000*10) + (800*30) + (1750*20) = 69000.0
             Double result = incomeCalculator.calculateIncome(1000, 800, 1750);
             assertEquals(69000.0, result, 0.001);
         }
     }
    
    @Nested
    @DisplayName("Invalid Equivalence Class Test Cases")
    class InvalidTestCases {

        @Test
        @DisplayName("IEC-01 - Invalid Input: Impeller count below minimum (999)")
        void testcase_IEC01_impellerBelowMin() {
            Double result = incomeCalculator.calculateIncome(999, 550, 1750);
            assertEquals(-1.0, result, 0.001);
        }
        
        @Test
        @DisplayName("IEC-02 (Defect) - Input Above Max: Impeller count (5001) is calculated")
        void testcase_IEC02_impellerAboveMax() {
            // Expected: (5001*10) + (550*30) + (1750*20) = 101510.0
            Double result = incomeCalculator.calculateIncome(5001, 550, 1750);
            assertNotEquals(-1.0, result, "Code should have rejected this value, but it calculated instead.");
            assertEquals(101510.0, result, 0.001);
        }

        @Test
        @DisplayName("IEC-03 - Invalid Input: Motor count below minimum (299)")
        void testcase_IEC03_motorBelowMin() {
            Double result = incomeCalculator.calculateIncome(3000, 299, 1750);
            assertEquals(-1.0, result, 0.001);
        }
        
        @Test
        @DisplayName("IEC-04 (Defect) - Input Above Max: Motor count (801) is calculated")
        void testcase_IEC04_motorAboveMax() {
            // Expected: (3000*10) + (801*30) + (1750*20) = 89030.0
            Double result = incomeCalculator.calculateIncome(3000, 801, 1750);
            assertNotEquals(-1.0, result, "Code should have rejected this value, but it calculated instead.");
            assertEquals(89030.0, result, 0.001);
        }

        @Test
        @DisplayName("IEC-05 - Invalid Input: Cover count below minimum (499)")
        void testcase_IEC05_coverBelowMin() {
            Double result = incomeCalculator.calculateIncome(3000, 550, 499);
            assertEquals(-1.0, result, 0.001);
        }
        
        @Test
        @DisplayName("IEC-06 (Defect) - Input Above Max: Cover count (3001) is calculated")
        void testcase_IEC06_coverAboveMax() {
            // Expected: (3000*10) + (550*30) + (3001*20) = 106520.0
            Double result = incomeCalculator.calculateIncome(3000, 550, 3001);
            assertNotEquals(-1.0, result, "Code should have rejected this value, but it calculated instead.");
            assertEquals(106520.0, result, 0.001);
        }
        
        @Test
        @DisplayName("IEC-07 - Invalid Input: Impeller count is zero")
        void testcase_IEC07_impellerIsZero() {
            Double result = incomeCalculator.calculateIncome(0, 550, 1750);
            assertEquals(-1.0, result, 0.001);
        }

        @Test
        @DisplayName("IEC-08 - Invalid Input: Motor count is zero")
        void testcase_IEC08_motorIsZero() {
            Double result = incomeCalculator.calculateIncome(3000, 0, 1750);
            assertEquals(-1.0, result, 0.001);
        }
        
        @Test
        @DisplayName("IEC-09 - Invalid Input: Cover count is zero")
        void testcase_IEC09_coverIsZero() {
            Double result = incomeCalculator.calculateIncome(3000, 550, 0);
            assertEquals(-1.0, result, 0.001);
        }
        
        @Test
        @DisplayName("IEC-10 - Invalid Input: Impeller count is negative (-100)")
        void testcase_IEC10_impellerIsNegative() {
            Double result = incomeCalculator.calculateIncome(-100, 550, 1750);
            assertEquals(-1.0, result, 0.001);
        }
        
        @Test
        @DisplayName("IEC-11 - Invalid Input: Motor has decimal value (550.5)")
        void testcase_IEC11_motorIsDecimal() {
        	// incomeCalculator.calculateIncome(3000, 550.5, 1750); // <--- บรรทัดนี้จะ Error
        }
        
        @Test
        @DisplayName("IEC-12 - Invalid Input: Cover is text ('abc')")
        void testcase_IEC12_coverIsText() {
            // incomeCalculator.calculateIncome(3000, 550, "abc"); // <--- บรรทัดนี้จะ Error
        }
        
        @Test
        @DisplayName("IEC-13 - Invalid Input: Impeller is symbol ('@#$')")
        void testcase_IEC13_impellerIsSymbol() {
        	// incomeCalculator.calculateIncome("@#$", 550, 1750); // <--- บรรทัดนี้จะ Error
        }
        
        @Test
        @DisplayName("IEC-14 - Invalid Input: Motor is null")
        void testcase_IEC14_motorIsNull() {
            // incomeCalculator.calculateIncome(3000, null, 1750); // <--- บรรทัดนี้จะ Error
        }
        
        @Test
        @DisplayName("IEC-15 - Invalid Input: Two out of three inputs are invalid (below min)")
        void testcase_IEC15_twoInvalidInputs() {
            Double result = incomeCalculator.calculateIncome(999, 299, 1750);
            assertEquals(-1.0, result, 0.001);
        }
        
        @Test
        @DisplayName("IEC-16 - Invalid Input: All three inputs are invalid (below min)")
        void testcase_IEC16_allInvalidInputs() {
            Double result = incomeCalculator.calculateIncome(1, 1, 1);
            assertEquals(-1.0, result, 0.001);
        }
    }
}
