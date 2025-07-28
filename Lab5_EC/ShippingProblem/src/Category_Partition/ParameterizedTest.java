package Category_Partition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import sqa.main.ShippingVehicle;

// เราจะใช้ชื่อคลาสว่า ShippingVehicleTest เพื่อให้สอดคล้องกับคลาสที่กำลังทดสอบ
class ParameterizedTest {

    private ShippingVehicle calculator;

    @BeforeEach
    void setUp() {
        calculator = new ShippingVehicle();
    }

    @Nested
    @DisplayName("Valid and Boundary Condition Tests")
    class ValidAndBoundaryCases {

        @Test
        @DisplayName("P-01: All inputs are zero")
        void test_P01_ZeroInput() {
            List<Integer> actualResult = calculator.calculate(0, 0, 0);
            assertEquals(List.of(-1), actualResult);
        }

        @Test
        @DisplayName("P-02: Total weight exceeds MAX_WEIGHT")
        void test_P02_Overweight() {
            List<Integer> actualResult = calculator.calculate(50, 50, 80);
            assertEquals(List.of(-1), actualResult);
        }

        @Test
        @DisplayName("P-03: Total weight equals MAX_WEIGHT")
        void test_P03_MaxWeight() {
            List<Integer> actualResult = calculator.calculate(0, 0, 100);
            assertEquals(List.of(-1), actualResult);
        }
        
        @Test
        @DisplayName("P-04: Medium count vs. remaining weight bug")
        void test_P04_NearMaxWeight() {
            List<Integer> actualResult = calculator.calculate(1, 1, 99);
            assertEquals(List.of(-1), actualResult);
        }
        
        @Test
        @DisplayName("P-05: Valid case with only large boxes")
        void test_P05_LargeOnly() {
            List<Integer> actualResult = calculator.calculate(0, 0, 50);
            assertEquals(List.of(50, 0, 0), actualResult);
        }
        
        @Test
        @DisplayName("P-06: Medium count vs. remaining weight bug 2")
        void test_P06_MediumCountBug() {
            List<Integer> actualResult = calculator.calculate(10, 10, 10);
            assertEquals(List.of(-1), actualResult);
        }
        
        @Test
        @DisplayName("P-07: Small count vs. remaining weight bug")
        void test_P07_SmallCountBug() {
            List<Integer> actualResult = calculator.calculate(1, 20, 10);
            assertEquals(List.of(-1), actualResult);
        }
    
        @Test
        @DisplayName("P-08: Bug returning remaining weight instead of small box count")
        void test_P08_ReturnWeightInsteadOfCountBug() {
            List<Integer> actualResult = calculator.calculate(4, 1, 0);
            assertEquals(List.of(0, 2, 3), actualResult);
        }
        
        @Test
        @DisplayName("P-09: Bug with only medium and small boxes")
        void test_P09_MediumAndSmallOnlyBug() {
            List<Integer> actualResult = calculator.calculate(10, 10, 0);
            assertEquals(List.of(-1), actualResult);
        }
        
        @Test
        @DisplayName("P-10: Bug with only small boxes")
        void test_P10_SmallOnlyBug() {
            List<Integer> actualResult = calculator.calculate(20, 0, 0);
            assertEquals(List.of(-1), actualResult);
        }   
        
    }
}