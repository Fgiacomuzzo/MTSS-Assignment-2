package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerToRomanTest {
    static IntegerToRoman converter = null;

    @BeforeClass
    public static void initializeConverter() {
        converter = new IntegerToRoman();
    }

    @Test(expected = NumberBelowZeroException.class)
    public void testNumberUnderZero() throws NumberBelowZeroException, NumberAOneThousand {
        int arabic_number = -1;
        converter.convert(arabic_number);
    }

    @Test(expected = NumberAOneThousand.class)
    public void testNumberAbove1000() throws NumberBelowZeroException, NumberAOneThousand {
        int arabic_number = 1001;
        converter.convert(arabic_number);
    }

    @Test
    public void testZeroNumber() throws NumberBelowZeroException, NumberAOneThousand {
        int arabic_number = 0;
        String expected = "";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }
}