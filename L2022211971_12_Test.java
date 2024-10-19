import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class L2022211971_12_Test {

        // 测试乘法的基本功能
        // 测试目的：验证乘法实现是否正确
        // 测试用例：
        // 1. num1 = "2", num2 = "3" 预期结果 "6"
        // 2. num1 = "123", num2 = "456" 预期结果 "56088"
        // 3. num1 = "0", num2 = "99" 预期结果 "0"
        @Test
        public void testMultiply() {
            Solution12 solution12=new Solution12();
            assertEquals("6", solution12.multiply("2", "3"));
            assertEquals("56088", solution12.multiply("123", "456"));
            assertEquals("0", solution12.multiply("0", "99"));

        }

        // 测试加法功能
        // 测试目的：验证加法实现是否正确
        // 测试用例：
        // 1. num1 = "123", num2 = "456" 预期结果 "579"
        // 2. num1 = "0", num2 = "0" 预期结果 "0"
        // 3. num1 = "999", num2 = "1" 预期结果 "1000"
        @Test
        public void testAddStrings() {
            Solution12 solution12 = new Solution12();

            assertEquals("579", solution12.addStrings("123", "456"));
            assertEquals("0", solution12.addStrings("0", "0"));
            assertEquals("1000", solution12.addStrings("999", "1"));
        }

        // 测试边界值
        // 测试目的：验证算法处理极限场景的能力
        // 测试用例：
        // 1. num1 = "1", num2 = "1" 预期结果 "1"
        // 2. num1 = "9", num2 = "9" 预期结果 "81"
        @Test
        public void testBoundaryValues() {
            Solution12 solution12 = new Solution12();

            assertEquals("1", solution12.multiply("1", "1"));
            assertEquals("81", solution12.multiply("9", "9"));
        }

}
