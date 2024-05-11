package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class RomanPrinterTest {
    static RomanPrinter printer;

    @BeforeClass
    public static void initializePrinter() {
        printer = new RomanPrinter();
    }

    @Test
    public void testPrintI() throws NumberBelowZeroException, NumberAOneThousand {
        int arabic_number = 1;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String(" _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n"));
    }

    @Test
    public void testPrintV() throws NumberBelowZeroException, NumberAOneThousand {
        int arabic_number = 5;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String("__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n"));

    }

    @Test
    public void testPrintX() throws NumberBelowZeroException, NumberAOneThousand {
        int arabic_number = 10;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String("__   __\n" +
                "\\ \\ / /\n" +
                " \\ V / \n" +
                "  > <  \n" +
                " / . \\ \n" +
                "/_/ \\_\\\n"));

    }
}