package ParameterizedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.TVPlan; // แก้ไข package ตามที่อยู่ของไฟล์ของคุณ
import sqa.main.TVPlan.TVPackage; // แก้ไข package ตามที่อยู่ของไฟล์ของคุณ

import static org.junit.jupiter.api.Assertions.assertEquals;

class TVPlanTest {

    @ParameterizedTest(name = "Package={0}, Offline={1}, Live={2}, Discount={3}, Expected={4}")
    @CsvSource({
            // Test cases from the Decision Table (based on correct business rules)
            // TVPackageName, offline_watching, live_service, discount, expectedPrice
            "STANDARD, false, false, false, 150.0", // R1
            "STANDARD, true,  false, false, 250.0", // R2
            "STANDARD, false, true,  false, 250.0", // R3
            "STANDARD, true,  true,  false, 350.0", // R4
            "PREMIUM,  false, false, false, 350.0", // R5
            "PREMIUM,  true,  false, false, 450.0", // R6
            "PREMIUM,  false, true,  false, 450.0", // R7
            "PREMIUM,  true,  true,  false, 550.0", // R8
            "FAMILY,   false, false, true,  400.0", // R9 (450 - 50)
            "FAMILY,   true,  false, true,  400.0", // R10 (Offline included, not extra. 450 - 50)
            "FAMILY,   false, true,  true,  500.0", // R11 (450 + 100 Live - 50)
            "FAMILY,   true,  true,  true,  500.0"  // R12 (Offline included, not extra. 450 + 100 Live - 50)
    })
    void testPricePerMonthWithDecisionTableCases(
            String packageName, 
            boolean offlineWatching, 
            boolean liveService, 
            boolean hasDiscount, 
            double expectedPrice) {
        
        // 1. Arrange
        // สร้าง Object TVPlan ตามเงื่อนไขของแต่ละ Test Case
        TVPlan plan = new TVPlan(offlineWatching, liveService, hasDiscount);
        
        // แปลง String จาก CsvSource ให้เป็น enum TVPackage
        TVPackage selectedPackage = TVPackage.valueOf(packageName);

        // 2. Act
        // เรียกเมธอดที่ต้องการทดสอบ
        double actualPrice = plan.pricePerMonth(selectedPackage);

        // 3. Assert
        // เปรียบเทียบผลลัพธ์ที่ได้จริง กับผลลัพธ์ที่คาดหวัง
        // ใช้ delta 0.01 เพื่อรองรับความคลาดเคลื่อนของ double
        assertEquals(expectedPrice, actualPrice, 0.01, 
            "Test failed for " + packageName + " with offline=" + offlineWatching + 
            ", live=" + liveService + ", discount=" + hasDiscount);
    }
}