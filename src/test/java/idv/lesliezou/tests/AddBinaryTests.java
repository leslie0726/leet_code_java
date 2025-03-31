package idv.lesliezou.tests;

import idv.lesliezou.algorithms.AddBinary;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AddBinaryTests {
    @Test
    public void testAddBinarySuccessful(){
        AddBinary testObject = new AddBinary();
        Assertions.assertEquals("100",testObject.addBinary("11","1"));
        Assertions.assertEquals("100",testObject.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));

    }
}
