package it.unipd.mtss;

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
}