////////////////////////////////////////////////////////////////////
// Francesco Giacomuzzo 2000553
// Alberto Michelazzo 2010007
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {
    private static HashMap<Character, String[]> converter = null;
    static {
        HashMap<Character, String[]> conMap = new HashMap<Character, String[]>();
        conMap.put('I', new String[] { " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|" });
        conMap.put('V', new String[] { "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    " });
        conMap.put('X', new String[] { "__   __",
                "\\ \\ / /",
                " \\ V / ",
                "  > <  ",
                " / . \\ ",
                "/_/ \\_\\" });
        conMap.put('L', new String[] { " _      ",
                "| |     ",
                "| |     ",
                "| |     ",
                "| |____ ",
                "|______|" });
        conMap.put('C', new String[] { "  _____ ",
                " / ____|",
                "| |     ",
                "| |     ",
                "| |____ ",
                " \\_____|" });
        conMap.put('D', new String[] { " _____  ",
                "|  __ \\ ",
                "| |  | |",
                "| |  | |",
                "| |__| |",
                "|_____/ " });
        conMap.put('M', new String[] { " __  __ ",
                "|  \\/  |",
                "| \\  / |",
                "| |\\/| |",
                "| |  | |",
                "|_|  |_|" });
        converter = conMap;
    }

    public static String print(int num)
            throws NumberBelowZeroException, NumberAOneThousand {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber.equals("")) {
            return "";
        }
        StringBuilder asciiArt = new StringBuilder();
        // Ciclo per stampare le righe
        for (int i = 0; i < 6; i++) {
            // Ciclo per stampare all' i-esima riga del carattere il singolo
            // carattere
            for (int c = 0; c < romanNumber.length(); c++) {
                asciiArt.append(converter.get(romanNumber.charAt(c))[i]);
            }
            asciiArt.append('\n');
        }
        return asciiArt.toString();
    }
}